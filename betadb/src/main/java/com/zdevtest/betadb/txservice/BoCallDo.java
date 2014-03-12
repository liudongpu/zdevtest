package com.zdevtest.betadb.txservice;

import com.srnpr.zapcom.baseclass.BaseLog;
import com.srnpr.zapcom.basehelper.BeansHelper;
import com.srnpr.zapcom.basehelper.FormatHelper;
import com.zdevtest.betadb.txmapper.TestCallMapper;
import com.zdevtest.betadb.txmodel.TestCall;

public class BoCallDo {

	
	
	public void toDo()
	{
		//CallServiceImpl callServiceImpl=new CallServiceImpl();
		CallServiceImpl callServiceImpl=BeansHelper.upBean("bean_betadb_testCallService");
		
		
		TestCall testCall=new TestCall();
		testCall.setDropdown(FormatHelper.upDateTime());
		
		int iCount= callServiceImpl.insertCall(testCall);
		BaseLog.LogInfo(this.getClass().getName(), 0, iCount);
		
		
		
	}
	
	
	
}
