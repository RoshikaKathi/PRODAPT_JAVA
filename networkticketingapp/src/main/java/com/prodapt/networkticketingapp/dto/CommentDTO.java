package com.prodapt.networkticketingapp.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDTO {
    private Integer commentId;
    private Integer ticketId;
    private String commentContent;
    private Integer userId;
    private LocalDateTime createDate;
}

