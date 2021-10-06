package com.sds.chocomuffin.molly.domain.question.values;

import com.sds.chocomuffin.molly.domain.question.specs.RankOperator;
import com.sds.chocomuffin.molly.domain.question.specs.SkipLogicType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;

@With
@Getter
@AllArgsConstructor
public class SkipLogic {
    SkipLogicType skipLogicType;
    private String fromChoiceId;
    private String toId;
    private Integer rank;
    private RankOperator rankOperator;
}
