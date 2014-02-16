package com.zdevtest.betautil.jta;

import static org.junit.Assert.*;

import org.junit.Test;

import com.srnpr.zapcom.basehelper.BeansHelper;
import com.srnpr.zapcom.basehelper.ThreadTestHelper;
import com.zdevtest.betautil.txservice.BoService;

public class TestCallJta extends ThreadTestHelper {

	@Test
	public void test() {
		doInsert();
	}

	public void doInsert() {
		
		
		BoService boService = BeansHelper
				.upBean("bean_betautil_txservice_boservice");
		
		boService.doInsert();
		
		boService.doError();

		 
	}

	@Override
	public void onRun() {

	}

}
