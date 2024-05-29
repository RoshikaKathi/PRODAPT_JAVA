package com.prodapt.networkticketingapp.service;

import com.prodapt.networkticketingapp.entities.TicketAging;
import com.prodapt.networkticketingapp.repositories.TicketAgingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketAgingService {
    @Autowired
    private TicketAgingRepository ticketAgingRepository;

    public List<TicketAging> findAll() {
        return ticketAgingRepository.findAll();
    }

    public Optional<TicketAging> findById(Integer agingId) {
        return ticketAgingRepository.findById(agingId);
    }

    public TicketAging save(TicketAging ticketAging) {
        return ticketAgingRepository.save(ticketAging);
    }

    public void deleteById(Integer agingId) {
        ticketAgingRepository.deleteById(agingId);
    }
}
