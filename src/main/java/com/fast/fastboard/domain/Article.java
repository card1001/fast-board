package com.fast.fastboard.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private String title;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime ModifiedAt;
    private String modifiedBy;
}