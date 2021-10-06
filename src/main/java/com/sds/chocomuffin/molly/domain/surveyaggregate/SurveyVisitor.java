package com.sds.chocomuffin.molly.domain.surveyaggregate;

public interface SurveyVisitor {

    void visit(CategoryView categoryView);
    void visit(QuestionView questionView);
}
