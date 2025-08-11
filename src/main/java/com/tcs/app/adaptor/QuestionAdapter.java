package com.tcs.app.adaptor;

import com.tcs.app.dto.QuestionResponseDto;
import com.tcs.app.model.Question;

public class QuestionAdapter {

    public static QuestionResponseDto toQuestionResponseDto(Question question){
        return QuestionResponseDto.builder()
                .content(question.getContent())
                .title(question.getTitle())
                .build();
    }

   /* public static QuestionResponseDto toQuestionResponseDto1(Question question) {
        return QuestionResponseDto.builder()

                .title(question.getTitle())
                .content(question.getContent())
                .createdAt(question.getCreatedAt())
                .build();
    }*/

}
