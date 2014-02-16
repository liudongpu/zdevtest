package com.zdevtest.betautil.trans;

import org.springframework.transaction.annotation.Transactional;

import com.srnpr.zapcom.basemodel.MDataMap;
import com.srnpr.zapdata.dbdo.DbUp;


@Transactional
public class TransSingle {

	
	
	public void doInsert()
	{
		
		MDataMap mDataMap=new MDataMap();
		
		mDataMap.inAllValues("dropdown","ax");
		
		
		DbUp.upTable("test_call").dataInsert(mDataMap);
		
		float f=1/0;
		
		
	}
	
	
	
}
