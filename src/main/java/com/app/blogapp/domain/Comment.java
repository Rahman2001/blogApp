package com.app.blogapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
    private String comment;
    private Date date;
    @OneToOne
    @JoinColumn(name = "author", referencedColumnName = "id")
    private User user;
    @OneToOne
    private Post post;
}
