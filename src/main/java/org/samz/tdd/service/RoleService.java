package org.samz.tdd.service;

import org.samz.tdd.model.Role;
import org.springframework.stereotype.Service;


@Service
public class RoleService {


    public Role getRole(String userId) {

        Role role = new Role("role");
        return role;
    }
}
