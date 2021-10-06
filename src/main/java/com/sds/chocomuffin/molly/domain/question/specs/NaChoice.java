package com.sds.chocomuffin.molly.domain.question.specs;


import com.sds.chocomuffin.molly.domain.question.Question;

public interface NaChoice {
    boolean isHasNaChoice();

    String getNaChoiceLabel();

    Question withHasNaChoice(boolean hasNaChoice);
}
