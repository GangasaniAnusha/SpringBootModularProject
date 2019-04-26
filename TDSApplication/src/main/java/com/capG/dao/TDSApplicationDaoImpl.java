package com.capG.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capG.model.TDSMaster;



@Component("daoObj")
@Repository
@ComponentScan("com")
public class TDSApplicationDaoImpl implements TDSApplicationDao{
	//To manage all the persistance objects
	@PersistenceContext
	EntityManager entityManagerObj;
	
	//It returns the TDSMaster object with the following id
	@Override
	public TDSMaster getById(int id) {
		TDSMaster tdsMasterObj=entityManagerObj.find(TDSMaster.class,id);
		return tdsMasterObj;
	}

}
