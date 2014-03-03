package com.zdevtest.betautil.annotation;

import com.srnpr.zapcom.baseannotation.ZapcomApi;
import com.srnpr.zapcom.topapi.RootInput;

public class Call extends RootInput {

	@ZapcomApi("abcd")
	private String filed;

	public String ToDo() {
		return "";
	}

	public String ToDo2() {
		return "";
	}

}
