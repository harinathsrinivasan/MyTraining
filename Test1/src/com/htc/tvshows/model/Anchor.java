package com.htc.tvshows.model;

public class Anchor {
	
	private String anchorID;
	private String anchorName;
	private String gender;
	public Anchor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Anchor(String anchorID, String anchorName, String gender) {
		super();
		this.anchorID = anchorID;
		this.anchorName = anchorName;
		this.gender = gender;
	}
	public String getAnchorID() {
		return anchorID;
	}
	public void setAnchorID(String anchorID) {
		this.anchorID = anchorID;
	}
	public String getAnchorName() {
		return anchorName;
	}
	public void setAnchorName(String anchorName) {
		this.anchorName = anchorName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
