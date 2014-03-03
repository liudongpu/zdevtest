package com.zdevtest.betautil.annotation;

import java.lang.reflect.Method;

import org.junit.Test;

public class TestAnnotation {

	@Test
	public void testRfc() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
		Class<?> cls = Class.forName("com.zdevtest.betautil.annotation.Call");
		
		
		
		
		
		
		boolean flag = cls.isAnnotationPresent(BetaAnnotation.class);
		if (flag) {
			System.out.println("判断类是annotation");
			BetaAnnotation annotation1 = cls.getAnnotation(BetaAnnotation.class);
			System.out.println(annotation1.value());
		}

		Method method = cls.getMethod("ToDo");
		flag = method.isAnnotationPresent(BetaAnnotation.class);
		if (flag) {
			System.out.println("判断方法也是annotation");
			BetaAnnotation annotation2 = method
					.getAnnotation(BetaAnnotation.class);
			System.out.println(annotation2.value()[0] + "   "
					+ annotation2.value());
		}
	}

}
