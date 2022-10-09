package org.samz.tdd.service;


import org.samz.tdd.model.Role;
import org.samz.tdd.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private RoleService roleService;

    User getUser(){
        Role role = roleService.getRole("2");
        return new User("lilin",role.getRoleName());
    }
}
