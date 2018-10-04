package com.htc.tvshows.model;

import java.util.Date;

public class TvShow {
	private String showID;
	private String showName;
	private String Duration;
	private Date fromDate;
	private Date toDate;
	private int hours,minutes;
	private float budget;
	private String channelID;
	public TvShow() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TvShow(String showID, String showName, String duration, Date fromDate, Date toDate, int hours, int minutes,
			float budget, String channelID) {
		super();
		this.showID = showID;
		this.showName = showName;
		Duration = duration;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.hours = hours;
		this.minutes = minutes;
		this.budget = budget;
		this.channelID = channelID;
	}
	public String getShowID() {
		return showID;
	}
	public void setShowID(String showID) {
		this.showID = showID;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public float getBudget() {
		return budget;
	}
	public void setBudget(float budget) {
		this.budget = budget;
	}
	public String getChannelID() {
		return channelID;
	}
	public void setChannelID(String channelID) {
		this.channelID = channelID;
	}
	
	

}
