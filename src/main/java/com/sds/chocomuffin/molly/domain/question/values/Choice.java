package com.sds.chocomuffin.molly.domain.question.values;

import com.sds.chocomuffin.molly.domain.question.FatChoice;

public interface Choice {

    String getId();
    String getText();
    String getPlainText();

    FatChoice toFatChoice();
}
