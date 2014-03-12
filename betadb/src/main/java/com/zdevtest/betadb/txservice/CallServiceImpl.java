package com.zdevtest.betadb.txservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.zdevtest.betadb.txmapper.TestCallMapper;
import com.zdevtest.betadb.txmodel.TestCall;


public class CallServiceImpl implements ICallService {

	@Autowired
	TestCallMapper testCallMapper;

	public int insertCall(TestCall testCall) {
		return testCallMapper.insertSelective(testCall);
		
	}

}
