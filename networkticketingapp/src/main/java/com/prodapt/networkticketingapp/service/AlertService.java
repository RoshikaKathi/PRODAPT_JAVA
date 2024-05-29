package com.prodapt.networkticketingapp.service;

import com.prodapt.networkticketingapp.entities.Alert;
import com.prodapt.networkticketingapp.repositories.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlertService {
    @Autowired
    private AlertRepository alertRepository;

    public List<Alert> findAll() {
        return alertRepository.findAll();
    }

    public Optional<Alert> findById(Integer alertId) {
        return alertRepository.findById(alertId);
    }

    public Alert save(Alert alert) {
        return alertRepository.save(alert);
    }

    public void deleteById(Integer alertId) {
        alertRepository.deleteById(alertId);
    }
}

