package com.app.blogapp.config;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FlywayEntity {
    private String location;
    private String url;
    private String user;
    private String password;
}
