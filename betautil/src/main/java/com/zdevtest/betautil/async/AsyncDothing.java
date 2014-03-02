package com.zdevtest.betautil.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.srnpr.zapcom.baseclass.BaseClass;
@Service
public class AsyncDothing extends BaseClass {

	@Async
	public void DoReal()
	{
		bLogInfo(0, "doreal");
		DoSomething();
	}
	
	@Async
	public void DoSomething()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bLogInfo(0, "dbasync");
	}
}
