package com.sds.chocomuffin.molly.domain.question;

import com.sds.chocomuffin.molly.domain.question.specs.ChoiceLabel;
import com.sds.chocomuffin.molly.domain.question.specs.ImageUploadMode;
import com.sds.chocomuffin.molly.domain.question.values.Choice;
import com.sds.chocomuffin.molly.domain.question.values.ImageChoice;
import com.sds.chocomuffin.molly.domain.question.values.RegularChoice;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@With
@ToString
public class FatChoice {

    @Field("id")
    private String id;
    private String text;
    private String plainText;
    private String url;
    private ImageUploadMode imageUploadMode;
    private String fileName;
    private String index;
    private String indexSummary;
    private List<String> factor;

    public Choice toChoice(ChoiceLabel choiceLabel) {
        if (choiceLabel == ChoiceLabel.IMAGE) {
            return new ImageChoice(this.id, this.text, this.plainText, this.url, this.imageUploadMode, this.fileName);
        }
        return new RegularChoice(this.id, this.text, this.plainText);
    }
}
