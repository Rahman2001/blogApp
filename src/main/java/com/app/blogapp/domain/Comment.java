package com.app.blogapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    private int id;
    private String message;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "author")
    private User user;
}
