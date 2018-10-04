package com.htc.tvshows.dao;

import com.htc.tvshows.model.TvShow;

public interface ShowDAO {

	public boolean createShow(TvShow show);
	public boolean deleteShow(String id);
	public boolean updateShow(String id);
	public TvShow getShow(String id);
}
