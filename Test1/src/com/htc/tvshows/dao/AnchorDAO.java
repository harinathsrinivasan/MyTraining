package com.htc.tvshows.dao;

import com.htc.tvshows.model.Anchor;

public interface AnchorDAO {

	boolean addAnchor(Anchor anchor);
	boolean deleteAnchor(String id);
	boolean updateAnchor(String id);
	boolean readAnchor(String id);
	
	
}
