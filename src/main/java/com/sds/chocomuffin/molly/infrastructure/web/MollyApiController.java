package com.sds.chocomuffin.molly.infrastructure.web;

import com.sds.chocomuffin.molly.application.SubmissionService;
import com.sds.chocomuffin.molly.application.SurveyAggregateService;
import com.sds.chocomuffin.molly.application.SurveyAggregateView;
import com.sds.chocomuffin.molly.domain.submssion.Submission;
import com.sds.chocomuffin.molly.infrastructure.web.request.SubmissionRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api")
public class MollyApiController {
    private final SurveyAggregateService surveyAggregateService;
    private final SubmissionService submissionService;

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("/submission")
    public Mono<Void> submit(@RequestBody SubmissionRequest submissionRequest) {

        return submissionService.addSubmission(submissionRequest.getMixedId(), submissionRequest.getBackgroundSurvey(), submissionRequest.getAnswers());
    }

    @GetMapping("/newsurvey/{surveyId}")
    public Mono<SurveyAggregateView> getSurvey(@PathVariable String surveyId) {
        return surveyAggregateService.getSurveyAggregateView(surveyId);
    }

}
