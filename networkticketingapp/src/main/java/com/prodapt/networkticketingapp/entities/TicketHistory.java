package com.prodapt.networkticketingapp.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// This entity can be used to keep track of all changes made to a ticket, 
// providing a history for auditing purposes.

@Entity
@Getter
@Setter
@Table(name = "ticket_history")
public class TicketHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer historyId;

    @ManyToOne
    @JoinColumn(name = "ticketId", nullable = false)
    private Ticket ticket;

    @Column(nullable = false)
    private String updatedBy;

    @Column(nullable = false)
    private String changeDescription;

    @Column(nullable = false)
    private LocalDateTime changeDate;
}
