package com.cs.demo;

import java.beans.PropertyEditorSupport;

public class AddressEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String[] texts = text.split(",");
		Address address = new Address();
		address.setPinCode(Integer.parseInt(texts[0]));
		address.setCountry(texts[1]);
		address.setState(texts[2]);
		setValue(address);
	}
}
