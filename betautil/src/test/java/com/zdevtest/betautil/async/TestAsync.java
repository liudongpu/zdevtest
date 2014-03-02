package com.zdevtest.betautil.async;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import com.srnpr.zapcom.basehelper.TestHelper;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations={"test.xml"})
public class TestAsync extends TestHelper {

	@Test
	public void test() {
		
		bLogTest("begin");
		doSomething();
		
		bLogTest("end");
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Autowired  
    private AsyncDothing asyncDothing;  
	
	public void doSomething()
	{
		
		
		asyncDothing.DoReal();
	}
	

}
