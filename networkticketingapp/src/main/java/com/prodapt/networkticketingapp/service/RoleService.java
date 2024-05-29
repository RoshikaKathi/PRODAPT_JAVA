package com.prodapt.networkticketingapp.service;

import com.prodapt.networkticketingapp.entities.Role;
import com.prodapt.networkticketingapp.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Optional<Role> findById(Integer roleId) {
        return roleRepository.findById(roleId);
    }

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public void deleteById(Integer roleId) {
        roleRepository.deleteById(roleId);
    }
}

