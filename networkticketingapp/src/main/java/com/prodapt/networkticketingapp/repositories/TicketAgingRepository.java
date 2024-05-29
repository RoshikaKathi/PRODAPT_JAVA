package com.prodapt.networkticketingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodapt.networkticketingapp.entities.TicketAging;

public interface TicketAgingRepository extends JpaRepository<TicketAging, Integer>{
	

}
