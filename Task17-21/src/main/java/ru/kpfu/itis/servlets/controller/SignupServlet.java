package ru.kpfu.itis.servlets.controller;


import ru.kpfu.itis.servlets.dao.StudentDao;
import ru.kpfu.itis.servlets.dao.StudentDaoImpl;
import ru.kpfu.itis.servlets.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignupServlet extends HttpServlet {

    StudentDao studentDao= new StudentDaoImpl();

    @Override
    public void doPost (HttpServletRequest request,
                        HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("pass");

        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setPassword(password);
        if(studentDao.add(student)) {
            request.setAttribute("ok", true);
            getServletConfig().getServletContext().getRequestDispatcher(
                    "/jsp/profile.jsp").forward(request, response);
        }  else {
            request.setAttribute("ok", false);
            getServletConfig().getServletContext().getRequestDispatcher(
                    "/signup.jsp").forward(request, response);
        }


    }
}