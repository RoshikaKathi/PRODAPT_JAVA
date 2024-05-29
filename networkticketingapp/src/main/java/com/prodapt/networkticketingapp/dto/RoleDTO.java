package com.prodapt.networkticketingapp.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleDTO {
    private Integer roleId;
    private String roleName;
    private List<?> users;
}

