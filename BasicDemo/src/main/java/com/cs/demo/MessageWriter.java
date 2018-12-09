package com.cs.demo;

import java.util.List;

public class MessageWriter implements IMessageWriter{

	IMessageConverter messageConverter;
	List<String> converters;
	

	public void setConverters(List<String> converters) {
		this.converters = converters;
		System.out.println(converters.toString());
	}

	/*public MessageWriter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
	
	public MessageWriter(String name, String msg, String age) {
		System.out.println("string" +name +" "+msg + age);
	}
  
	public MessageWriter(int age, String msg) {
		System.out.println(age +" "+msg);
	}*/
	@Override
	public void writeMessage(String msg) {
		System.out.println(messageConverter.convertMessage(msg));
	}

	public void setMessageConverter(IMessageConverter messageConverter) {
		this.messageConverter = messageConverter;
	}
	

}
