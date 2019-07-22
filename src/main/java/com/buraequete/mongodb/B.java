package com.buraequete.mongodb;

import org.bson.codecs.pojo.annotations.BsonId;

public class B extends A<Float> {

	@BsonId
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}