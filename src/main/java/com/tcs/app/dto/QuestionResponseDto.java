package com.tcs.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QuestionResponseDto {

    private String id;

    private String title;

    private String content;

    private LocalDateTime createdAt;
}
