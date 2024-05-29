package com.prodapt.networkticketingapp.entities;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketId;
    
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String priority;

    @Column(nullable = false)
    private String severity;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CustomerTier customerTier;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private String ticketStatus;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @Column(nullable = false)
    private LocalDateTime lastUpdatedDate;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private IssueType issueType;

    @ManyToMany
    @JoinTable(
        name = "user_tickets",
        joinColumns = @JoinColumn(name = "ticketId"),
        inverseJoinColumns = @JoinColumn(name = "userId"))
    private Set<User> users;

}
