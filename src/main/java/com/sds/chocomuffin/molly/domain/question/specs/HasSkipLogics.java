package com.sds.chocomuffin.molly.domain.question.specs;

import com.sds.chocomuffin.molly.domain.question.Question;
import com.sds.chocomuffin.molly.domain.question.values.SkipLogic;

import java.util.List;

public interface HasSkipLogics {
    List<SkipLogic> getSkipLogics();

    Question withSkipLogics(List<SkipLogic> skipLogics);
}
