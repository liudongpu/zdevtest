package com.zdevtest.betautil.jta;

import static org.junit.Assert.*;

import org.junit.Test;

import com.srnpr.zapcom.baseclass.BaseLog;
import com.srnpr.zapcom.basehelper.BeansHelper;
import com.srnpr.zapcom.basehelper.FormatHelper;
import com.zdevtest.betadb.txmodel.TestCall;
import com.zdevtest.betadb.txservice.BoCallDo;
import com.zdevtest.betadb.txservice.CallServiceImpl;
import com.zdevtest.betadb.txservice.ICallService;

public class TestNewJta {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		//BoCallDo boCallDo=new BoCallDo();
		
		CallServiceImpl callServiceImpl=BeansHelper.upBean("bean_betadb_testCallService");
		
		
		TestCall testCall=new TestCall();
		testCall.setDropdown(FormatHelper.upDateTime());
		testCall.setZid(9);
		
		int iCount= callServiceImpl.insertCall(testCall);
		BaseLog.LogInfo(this.getClass().getName(), 0, iCount);
		
		//TestCall testCall=new TestCall();
		//testCall.setDropdown(FormatHelper.upDateTime());
		
		
	}

}
