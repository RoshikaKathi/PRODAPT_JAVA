package com.prodapt.networkticketingapp.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlertDTO {
    private Integer alertId;
    private Integer ticketId;
    private String message;
    private boolean resolved;
    private LocalDateTime alertDate;
}

