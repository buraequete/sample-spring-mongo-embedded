package com.buraequete.mongodb;

import com.google.common.collect.Lists;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mongob")
public class MongoBController {

	@Autowired
	private MongoTemplate mongoTemplate;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public Iterable<B> test() {
		B b = new B();
		b.setId(System.currentTimeMillis());
		List<Float> doubles = Lists.newArrayList(5.5f, 6.6f);
		List<Float> doubles2 = Lists.newArrayList(7.7f, 8.8f);
		List<List<Float>> doubleses = Lists.newArrayList(doubles, doubles2);
		b.setValues(doubleses);
		mongoTemplate.save(b);
		return mongoTemplate.findAll(B.class);
	}
}
