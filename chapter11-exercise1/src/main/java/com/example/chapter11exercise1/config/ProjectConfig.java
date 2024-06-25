package com.example.chapter11exercise1.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.chapter11exercise1.proxy")
public class ProjectConfig {
}
