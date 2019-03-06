package com.example.auth.controller;

import com.example.auth.domain.User;
import com.example.auth.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @GetMapping("/current")
    public Principal getUser(Principal principal) {
        log.debug("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " + principal.getName());
        return principal;
    }

//    @PreAuthorize("#oauth2.hasScope('server')")
    @PostMapping
    public void createUser(@RequestBody User user) {
        userService.create(user);
    }
}
