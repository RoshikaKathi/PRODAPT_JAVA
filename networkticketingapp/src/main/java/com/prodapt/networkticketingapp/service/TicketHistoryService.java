package com.prodapt.networkticketingapp.service;

import com.prodapt.networkticketingapp.entities.TicketHistory;
import com.prodapt.networkticketingapp.repositories.TicketHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketHistoryService {
    @Autowired
    private TicketHistoryRepository ticketHistoryRepository;

    public List<TicketHistory> findAll() {
        return ticketHistoryRepository.findAll();
    }

    public Optional<TicketHistory> findById(Integer historyId) {
        return ticketHistoryRepository.findById(historyId);
    }

    public TicketHistory save(TicketHistory ticketHistory) {
        return ticketHistoryRepository.save(ticketHistory);
    }

    public void deleteById(Integer historyId) {
        ticketHistoryRepository.deleteById(historyId);
    }
}
