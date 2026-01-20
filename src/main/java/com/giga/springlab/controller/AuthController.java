package com.giga.springlab.controller;

import java.util.Map;

import com.giga.spring.annotation.controller.GigaSession;
import com.giga.spring.annotation.controller.PathVariable;
import com.giga.spring.annotation.controller.RestController;
import com.giga.spring.annotation.controller.security.Authorized;
import com.giga.spring.annotation.controller.security.Role;
import com.giga.spring.annotation.http.DoGet;

@RestController
public class AuthController {
    @DoGet(path = "/auth/set-role/{role}")
    public String registerRole(@PathVariable("role") String role, @GigaSession Map<String, Object> session) {
        String roleVariableName = "role";

        session.put(roleVariableName, role);

        return (String) session.get(roleVariableName);
    }

    
    @DoGet(path = "/auth/authorized")
    @Authorized
    String authorizedMethod() {
        return "You are authorized";
    }

    @DoGet(path = "/auth/admin")
    @Role("admin")
    String authorizedMethodWithRole() {
        return "You are authorized, as an admin";
    }
}
