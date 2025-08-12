package com.tcs.app.service;

import com.tcs.app.dto.QuestionRequestDto;
import com.tcs.app.dto.QuestionResponseDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IQuestionService {
    public Mono<QuestionResponseDto> createQuestion(QuestionRequestDto questionRequestDto);

    public Flux<QuestionResponseDto> getAllQuestions(String cursor, int size);

    public Flux<QuestionResponseDto> searchQuestion(String searchTerm, int offset, int page);
}
