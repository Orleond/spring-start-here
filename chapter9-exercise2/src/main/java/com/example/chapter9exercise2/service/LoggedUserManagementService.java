package com.example.chapter9exercise2.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
@Setter
@Getter
public class LoggedUserManagementService {
    private String username;
}
