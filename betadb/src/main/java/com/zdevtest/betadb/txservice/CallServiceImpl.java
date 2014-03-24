package com.zdevtest.betadb.txservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.srnpr.zapcom.basehelper.BeansHelper;
import com.zdevtest.betadb.txmapper.TestCallMapper;
import com.zdevtest.betadb.txmodel.TestCall;


public class CallServiceImpl implements ICallService {

	
	

	public int insertCall(TestCall testCall) {
		TestCallMapper testCallMapper=BeansHelper.upBean("bean_betadb_testcallmapper");
		
		return testCallMapper.insertSelective(testCall);
		
	}

}
