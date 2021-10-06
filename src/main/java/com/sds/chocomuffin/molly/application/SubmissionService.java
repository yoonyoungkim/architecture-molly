package com.sds.chocomuffin.molly.application;

import com.sds.chocomuffin.molly.domain.submssion.Answer;
import com.sds.chocomuffin.molly.domain.submssion.Submission;
import com.sds.chocomuffin.molly.domain.submssion.SubmissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SubmissionService {
    private final SubmissionRepository submissionRepository;

    public Mono<Void> addSubmission(String surveyId, List<Answer> backgroundSurvey, List<Answer> answers) {
        Submission submission = new Submission(null, surveyId, "", "", backgroundSurvey, answers, LocalDateTime.now());
        return submissionRepository.save(submission)
                .then();
    }
}
