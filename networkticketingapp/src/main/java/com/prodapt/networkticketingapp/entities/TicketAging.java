package com.prodapt.networkticketingapp.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ticket_aging")
public class TicketAging {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer agingId;

    @OneToOne
    @JoinColumn(name = "ticketId", nullable = false)
    private Ticket ticket;
    
    //open time and close time
    @Column(nullable = false)
    private LocalDateTime flagDate;

    @Column(nullable = false)
    private boolean alerted;
}
