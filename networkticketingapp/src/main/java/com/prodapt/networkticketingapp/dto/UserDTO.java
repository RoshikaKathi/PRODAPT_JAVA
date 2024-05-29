package com.prodapt.networkticketingapp.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private Integer userId;
    private String username;
    private String hashedpassword;
    private List<?> roles;
}

