package com.buraequete.mongodb;

import java.util.List;

public class A<T> {
	private List<List<T>> values;

	public List<List<T>> getValues() {
		return values;
	}

	public void setValues(List<List<T>> values) {
		this.values = values;
	}
}

