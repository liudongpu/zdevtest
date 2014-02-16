package com.zdevtest.betautil.trans;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 单库事务测试
 * @author srnpr
 *
 */
public class SingleDbTrans {

	@Test
	public void test() {
		
		
		TransSingle transSingle=new TransSingle();
		transSingle.doInsert();
		
		
		
		
	}

}
