package com.kpfu.itis;

import java.util.Date;
import java.util.List;

public class CV {

	private int id;
	private String title;
	private Education education;
	private Date experienceFrom;
	private Gender gender;
	private String text;
	
	private User user;
	private List<Category> categories;
	private List<Invite> invites;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public Date getExperience_from() {
		return experienceFrom;
	}

	public void setExperience_from(Date experience_from) {
		this.experienceFrom = experience_from;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getExperienceFrom() {
		return experienceFrom;
	}

	public void setExperienceFrom(Date experienceFrom) {
		this.experienceFrom = experienceFrom;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Invite> getInvites() {
		return invites;
	}

	public void setInvites(List<Invite> invites) {
		this.invites = invites;
	}
}
