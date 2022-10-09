package org.samz.tdd.service;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.samz.tdd.model.Role;
import org.samz.tdd.model.User;

//@RunWith(PowerMockRunner.class)
public class UserServiceTest extends TestCase {


    @Mock
    RoleService roleService;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void before(){

        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void testGetUser() {

        userService = PowerMockito.mock(UserService.class);
        roleService = PowerMockito.mock(RoleService.class);

        Mockito.when(roleService.getRole("2")).thenReturn(new Role("role2"));
        User user = userService.getUser();
        assertNotNull(user);
    }
}