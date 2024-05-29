package com.prodapt.networkticketingapp.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketHistoryDTO {
    private Long id;
    private Long ticketId;
    private String action;
    private LocalDateTime timestamp;
}
