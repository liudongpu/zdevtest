package com.zdevtest.betadb.txservice;

import org.springframework.stereotype.Service;

import com.zdevtest.betadb.txmodel.TestCall;


@Service
public interface ICallService {

	
	public int insertCall(TestCall testCall);
	
	
}
