package com.app.blogapp.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "flyway")
public class FlywayProperty {
    private String url;
    private String user;
    private String password;
    private String location;
}
