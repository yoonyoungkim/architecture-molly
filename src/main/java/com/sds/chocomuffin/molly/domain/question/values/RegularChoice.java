package com.sds.chocomuffin.molly.domain.question.values;

import com.sds.chocomuffin.molly.domain.question.FatChoice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegularChoice implements Choice {

    @Field("id")
    private String id;
    private String text;
    private String plainText;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getPlainText() {
        return plainText;
    }

    @Override
    public FatChoice toFatChoice() {
        return new FatChoice(id, text, plainText, null, null, null, null, null, null);
    }
}
