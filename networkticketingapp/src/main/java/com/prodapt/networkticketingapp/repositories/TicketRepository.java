package com.prodapt.networkticketingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodapt.networkticketingapp.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
