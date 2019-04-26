package com.capG.dao;

import com.capG.model.TDSMaster;

public interface TDSApplicationDao {
//interface of a dao which contains a method declaration to search for the user with following id
	public TDSMaster getById(int id);
}
