package com.tcs.app.controller;

import com.tcs.app.dto.QuestionRequestDto;
import com.tcs.app.dto.QuestionResponseDto;
import com.tcs.app.service.IQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/questions")
@RequiredArgsConstructor
public class QuestionController {

    private final IQuestionService iQuestionService;

    @PostMapping()
    public Mono<QuestionResponseDto> createQuestion(@RequestBody QuestionRequestDto questionRequestDto){
        return iQuestionService.createQuestion(questionRequestDto)
                .doOnSuccess(response -> System.out.println("Question created successfully: " + response))
                .doOnError(error -> System.out.println("Error creating question: " + error));
    }

    @GetMapping("/getAll")
    public Flux<QuestionResponseDto> getAllQuestion( @RequestParam(required = false) String cursor,
                                                     @RequestParam(defaultValue = "10") int size){
        return  iQuestionService.getAllQuestions(cursor,size)
                .doOnError(error -> System.out.println("Error fetching questions: " + error))
                .doOnComplete(() -> System.out.println("Questions fetched successfully"));
    }

    @GetMapping
    public Flux<QuestionResponseDto> searchQuestions(
        @RequestParam String query,
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "0") int size
    ){
        return  iQuestionService.searchQuestion(query,page,size);
    }
}
