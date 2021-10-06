package com.sds.chocomuffin.molly.configration;

import com.sds.chocomuffin.molly.infrastructure.repository.mongoconverter.QuestionReadingConverter;
import com.sds.chocomuffin.molly.infrastructure.repository.mongoconverter.QuestionWritingConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

import java.util.Arrays;

@Configuration
public class MongoConverters {
    @Bean
    public MongoCustomConversions mongoCustomConversions() {

        return new MongoCustomConversions(
                Arrays.asList(
                        new QuestionReadingConverter(),
                        new QuestionWritingConverter()));
    }

}
