package com.sds.chocomuffin.molly.domain.question.specs;

import com.sds.chocomuffin.molly.domain.question.Question;

public interface Opinion {
    boolean isHasOpinionInputOption();
    String getOpinionQuestionText();
    Question withHasOpinionInputOption(boolean hasOpinionInputOption);
}
