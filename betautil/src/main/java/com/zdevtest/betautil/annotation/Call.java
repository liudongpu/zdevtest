package com.zdevtest.betautil.annotation;

import java.util.List;

import com.srnpr.zapcom.baseannotation.ZapcomApi;
import com.srnpr.zapcom.topapi.RootInput;

public class Call extends RootInput {

	@ZapcomApi("abcd")
	private String filed;

	@ZapcomApi("mysubclass")
	private List<SubCall> subs;

	
	private String f3;
	
	private SubCall one;
	
	
	public String ToDo() {
		return "";
	}

	public String ToDo2() {
		return "";
	}

	public List<SubCall> getSubs() {
		return subs;
	}

	public void setSubs(List<SubCall> subs) {
		this.subs = subs;
	}

	public String getF3() {
		return f3;
	}

	public void setF3(String f3) {
		this.f3 = f3;
	}

	public SubCall getOne() {
		return one;
	}

	public void setOne(SubCall one) {
		this.one = one;
	}

}
