package com.wisdge.redisson.configure.redisson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClassProperty {

	@JsonProperty("class")
	private String className;

	public ClassProperty(String className) {
		super();
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
}
