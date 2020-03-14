package com.seongbinko.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostUpdateReuqestDto {
    private String title;
    private String content;
    @Builder
    public PostUpdateReuqestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
