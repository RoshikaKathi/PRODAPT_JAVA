package com.prodapt.networkticketingapp.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketDTO {
    private Integer ticketId;
    private String title;
    private String description;
    private String priority;
    private String severity;
    private String customerTier;
    private String ticketStatus;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdatedDate;
    private String issueType;
    private Integer userId;
}

