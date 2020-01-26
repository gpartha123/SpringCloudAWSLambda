package com.springboot.Handler;

import java.util.function.Function;

import org.springframework.stereotype.Component;
@Component
public class UpperCaseStringConverter implements Function<String, String> {

	@Override
	public String apply(String str) {
		// TODO Auto-generated method stub
		return str.toUpperCase();
	}

}
