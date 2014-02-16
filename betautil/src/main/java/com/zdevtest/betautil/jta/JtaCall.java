package com.zdevtest.betautil.jta;

import com.srnpr.zapcom.basehelper.BeansHelper;
import com.srnpr.zapcom.basehelper.FormatHelper;
import com.zdevtest.betadb.txmapper.TestCallMapper;
import com.zdevtest.betadb.txmapper.ZaWeblogMapper;
import com.zdevtest.betadb.txmodel.TestCall;
import com.zdevtest.betadb.txmodel.ZaWeblog;

public class JtaCall {

	public void doInsertDb() {

		TestCallMapper testCallMapper = BeansHelper
				.upBean("bean_betautil_txmapper_testcall");

		TestCall testCall = new TestCall();

		testCall.setDropdown(FormatHelper.upDateTime());

		testCallMapper.insert(testCall);

		ZaWeblogMapper zaWeblogMapper = BeansHelper
				.upBean("bean_betautil_txmapper_zaweblog");
		ZaWeblog zaWeblog=new ZaWeblog();
		zaWeblog.setCreateTime(FormatHelper.upDateTime());
		
		zaWeblogMapper.insert(zaWeblog);
		
		

	}

}
