package com.zdevtest.betautil.txservice;

import com.srnpr.zapcom.basehelper.BeansHelper;
import com.srnpr.zapcom.basehelper.FormatHelper;
import com.srnpr.zapdata.dbface.ITxService;
import com.zdevtest.betadb.txmapper.TestCallMapper;
import com.zdevtest.betadb.txmapper.ZaWeblogMapper;
import com.zdevtest.betadb.txmodel.TestCall;
import com.zdevtest.betadb.txmodel.ZaWeblog;

public class BoService implements ITxService {

	/**
	 * 插入数据库
	 */
	public void doInsert() {

		TestCallMapper testCallMapper = BeansHelper
				.upBean("bean_betautil_txmapper_testcall");

		TestCall testCall = new TestCall();

		testCall.setDropdown(FormatHelper.upDateTime());

		testCallMapper.insertSelective(testCall);

		ZaWeblogMapper zaWeblogMapper = BeansHelper
				.upBean("bean_betautil_txmapper_zaweblog");
		ZaWeblog zaWeblog = new ZaWeblog();
		zaWeblog.setCreateTime(FormatHelper.upDateTime());

		zaWeblogMapper.insertSelective(zaWeblog);

	}

	/**
	 * 插入数据库
	 */
	public void doError() {

		doInsert();
		float f = 1 / 0;

	}

}
