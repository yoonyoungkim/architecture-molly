package com.sds.chocomuffin.molly.application;

import com.sds.chocomuffin.molly.domain.surveyaggregate.SurveyAggregateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class SurveyAggregateService {
    private final SurveyAggregateRepository surveyAggregateRepository;

    public Mono<SurveyAggregateView> getSurveyAggregateView(String surveyId) {
        return surveyAggregateRepository.findById(surveyId)
                .switchIfEmpty(Mono.error(new RuntimeException("no item")))
                .map(SurveyAggregateView::new);
    }
}
