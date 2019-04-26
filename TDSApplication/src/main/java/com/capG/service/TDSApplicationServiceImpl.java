package com.capG.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.capG.dao.TDSApplicationDao;
import com.capG.dao.TDSApplicationDaoImpl;
import com.capG.model.TDSMaster;

@Component("tdsApplicationServiceObj")
@Service
@Transactional
public class TDSApplicationServiceImpl implements TDSApplicationService {
	//service layer implementation which takes the dao object
	
	@Autowired
	TDSApplicationDao daoObj; 
	
	@Override
	public TDSMaster getById(int id) {
		return daoObj.getById(id);
	}

}
