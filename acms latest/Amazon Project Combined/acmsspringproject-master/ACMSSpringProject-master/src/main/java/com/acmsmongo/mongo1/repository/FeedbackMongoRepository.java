package com.acmsmongo.mongo1.repository;

import org.springframework.data.repository.CrudRepository;

import com.acmsmongo.mongo1.model.Feedback;

public interface FeedbackMongoRepository extends CrudRepository<Feedback, String>{}