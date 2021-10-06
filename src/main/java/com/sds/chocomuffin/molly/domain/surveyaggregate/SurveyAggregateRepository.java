package com.sds.chocomuffin.molly.domain.surveyaggregate;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SurveyAggregateRepository extends ReactiveCrudRepository<SurveyAggregate, String> {
}
