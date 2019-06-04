package com.acmsmongo.mongo1.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.acmsmongo.mongo1.model.Feedback;

@Repository
public class FeedbackSearchRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public Collection<Feedback> searchFeedbacks(String text) {
		return mongoTemplate.find(Query.query(new Criteria()
						.orOperator(Criteria.where("description").regex(text, "i"), 
									Criteria.where("q1").regex(text, "i"), 
									Criteria.where("Sid").regex(text, "i"))
						), Feedback.class);
	}
	
}
