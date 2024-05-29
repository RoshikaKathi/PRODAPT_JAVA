package com.prodapt.networkticketingapp.dto;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketAgingDTO {
    private Integer agingId;
    private Integer ticketId;
    private LocalDateTime flagDate;
    //private LocalDateTime openTime;
    //private LocalDateTime closeTime;
    private boolean alerted;
}
