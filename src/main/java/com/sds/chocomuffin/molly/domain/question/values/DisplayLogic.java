package com.sds.chocomuffin.molly.domain.question.values;

import com.sds.chocomuffin.molly.domain.question.specs.RankOperator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;

@With
@Getter
@AllArgsConstructor
public class DisplayLogic {
    private String questionId;
    private String choiceId;
    private String operator;
    private Integer rank;
    private RankOperator rankOperator;
}
