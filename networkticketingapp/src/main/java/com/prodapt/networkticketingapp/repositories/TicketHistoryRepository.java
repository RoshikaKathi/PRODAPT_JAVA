package com.prodapt.networkticketingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodapt.networkticketingapp.entities.TicketHistory;

public interface TicketHistoryRepository extends JpaRepository<TicketHistory, Integer>{

}
