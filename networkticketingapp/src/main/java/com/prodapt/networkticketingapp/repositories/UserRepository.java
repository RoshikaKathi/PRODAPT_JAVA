package com.prodapt.networkticketingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.networkticketingapp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
 