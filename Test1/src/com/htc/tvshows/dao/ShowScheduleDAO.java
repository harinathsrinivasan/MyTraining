package com.htc.tvshows.dao;

import java.util.ArrayList;

import com.htc.tvshows.model.ShowSchedule;

public interface ShowScheduleDAO {

	boolean createShowSchedule(ShowSchedule showSchedule);
	boolean updateShowSchedule(String showID);
	boolean deleteShowSchedule(String ShowID);
	ShowSchedule getShowSchedule(String showID);
	ArrayList<ShowSchedule>getShowscheduleByAnchor(String AnchorID);
	boolean changeShowtime(ShowSchedule shw1,ShowSchedule shw2);
	
	
}
