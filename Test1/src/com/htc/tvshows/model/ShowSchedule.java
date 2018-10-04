package com.htc.tvshows.model;

public class ShowSchedule {
	private TvShow tvshw=new TvShow();
	private Anchor anchor=new Anchor();
	
	public ShowSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShowSchedule(TvShow tvshw, Anchor anchor) {
		super();
		this.tvshw = tvshw;
		this.anchor = anchor;
	}
	public TvShow getTvshw() {
		return tvshw;
	}
	public void setTvshw(TvShow tvshw) {
		this.tvshw = tvshw;
	}
	public Anchor getAnchor() {
		return anchor;
	}
	public void setAnchor(Anchor anchor) {
		this.anchor = anchor;
	}
	@Override
	public String toString() {
		return "ShowSchedule [tvshw=" + tvshw + ", anchor=" + anchor + ", getTvshw()=" + getTvshw() + ", getAnchor()="
				+ getAnchor() + "]";
	}
	
	
	

}
