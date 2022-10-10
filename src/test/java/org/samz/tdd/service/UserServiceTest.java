package org.samz.tdd.service;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.samz.tdd.model.Role;
import org.samz.tdd.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest extends TestCase {


    @Autowired
    private UserService userService;

    /**
     *
     */
    @MockBean
    private RoleService roleService;

    @Before
    public void before() {

        MockitoAnnotations.openMocks(this);
        //实现依赖注入的bean调用的方法
        Mockito.when(roleService.getRole("2")).thenReturn(new Role("1"));

    }

    @Test
    public void testGetUser() {
        User user = userService.getUser();
        assertNotNull(user);
    }
}