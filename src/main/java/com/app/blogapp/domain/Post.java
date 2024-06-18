package com.app.blogapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    private long id;
    private String topic;
    private String description;
    @ManyToOne
    private User author;
//    @OneToMany
//    @JoinColumn(name = "comments")
//    private List<Comment> comments;

}
