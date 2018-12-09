package com.cs.demo;

public interface IMessageWriter {

	void writeMessage(String msg);
	public void setMessageConverter(IMessageConverter messageConverter);
}
