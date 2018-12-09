package com.cs.demo;

public class HtmlMessageConverter implements IMessageConverter{

	@Override
	public String convertMessage(String msg) {
		return "HTML "+ msg;
	}

}
