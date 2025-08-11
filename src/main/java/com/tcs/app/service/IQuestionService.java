package com.tcs.app.service;

import com.tcs.app.dto.QuestionRequestDto;
import com.tcs.app.dto.QuestionResponseDto;
import reactor.core.publisher.Mono;

public interface IQuestionService {
    public Mono<QuestionResponseDto> createQuestion(QuestionRequestDto questionRequestDto);
}
