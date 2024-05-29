package com.prodapt.networkticketingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodapt.networkticketingapp.entities.Alert;

public interface AlertRepository extends JpaRepository<Alert, Integer>{

}
