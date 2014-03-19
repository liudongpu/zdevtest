package com.zdevtest.betautil.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.srnpr.zapcom.basehelper.SecrurityHelper;
import com.srnpr.zapcom.basehelper.TestHelper;

public class TestDes extends TestHelper {

	@Test
	public void test() {

		String sPassString = "";
		
		String sDecString="";

		try {
			sPassString = SecrurityHelper.DesEncryptStr("abcdefgh",
					"a");
			
			sDecString=SecrurityHelper.DesDencryptStr("abcdefgh", sPassString);
		} catch (Exception e) {
			// TODO: handle exception
		}

		bLogTest("source:"+sPassString);
		
		bLogTest("back:"+sDecString);

	}

}
