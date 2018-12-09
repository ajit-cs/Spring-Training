package com.cs.demo;

import java.util.List;

public class Comp {
	List<String> subjects;

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
		System.out.println(subjects);
	}

}
