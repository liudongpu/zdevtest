package com.zdevtest.betautil.annotation;

import com.srnpr.zapcom.baseannotation.ZapcomApi;

public class SubCall  {

	@ZapcomApi("vx")
	private String subName="";

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}
	
	
}
