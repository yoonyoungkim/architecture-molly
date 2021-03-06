package com.sds.chocomuffin.molly.domain.question;

import com.sds.chocomuffin.molly.domain.question.specs.*;
import com.sds.chocomuffin.molly.domain.question.values.Choice;
import com.sds.chocomuffin.molly.domain.question.values.DisplayLogic;
import com.sds.chocomuffin.molly.domain.question.values.SkipLogic;
import com.sds.chocomuffin.molly.domain.surveyaggregate.QuestionView;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.With;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Getter
@ToString
public class RatingQuestion implements Question, HasChoice, NaChoice, Opinion, HasSkipLogics, RatingLike {

    @With
    private final String id;
    private final QuestionType questionType;
    @With
    private final RequiredType requiredType;
    private final String text;
    private final String plainText;
    private final Set<String> tags;
    private final String keyword;
    @With
    private final String referenceId;
    @With
    private final String referenceNo;
    @With
    private final List<DisplayLogic> displayLogics;

    @With
    private final List<SkipLogic> skipLogics;

    private final List<Choice> choices;
    @With
    private final boolean hasNaChoice;
    private final String naChoiceLabel;
    @With
    private final boolean hasOpinionInputOption;
    private final String opinionQuestionText;

    public RatingQuestion(QuestionBasic basic, List<Choice> choices, boolean hasNaChoice, String naChoiceLabel, boolean hasOpinionInputOption, String opinionQuestionText, List<SkipLogic> skipLogics) {
        this.id = basic.getId();
        this.questionType = basic.getQuestionType();
        this.requiredType = basic.getRequiredType();
        this.text = basic.getText();
        this.plainText = basic.getPlainText();
        this.tags = basic.getTags();
        this.keyword = basic.getKeyword();
        this.referenceId = basic.getReferenceId();
        this.referenceNo = basic.getReferenceNo();
        this.displayLogics = basic.getDisplayLogics();

        this.skipLogics = skipLogics;

        this.choices = choices;
        this.hasNaChoice = hasNaChoice;
        this.naChoiceLabel = naChoiceLabel;
        this.hasOpinionInputOption = hasOpinionInputOption;
        this.opinionQuestionText = opinionQuestionText;
    }

    @Override
    public boolean equals(Question question) {
        if (!(question instanceof RatingQuestion)) return false;

        if (!Question.super.equals(question)) return false;

        return choiceEquals((HasChoice) question);
    }

    @Override
    public QuestionView toQuestionView() {
        return questionViewBuilder(this)
                .skipLogics(this.getSkipLogics())
                .choices(toFatChoice(this.getChoices()))
                .hasNaChoice(this.isHasNaChoice())
                .naChoiceLabel(this.getNaChoiceLabel())
                .hasOpinionInputOption(this.isHasOpinionInputOption())
                .opinionQuestionText(this.getOpinionQuestionText())
                .build();
    }
}
