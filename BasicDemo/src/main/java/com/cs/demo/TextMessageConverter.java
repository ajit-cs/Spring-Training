package com.cs.demo;

public class TextMessageConverter implements IMessageConverter{

	@Override
	public String convertMessage(String msg) {
		return "TEXT "+ msg;
	}

}
