package com.zdevtest.betautil.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BetaAnnotation {

	public String[] value() default {};
	
	
	public String[] target() default {};

}
