package com.app.blogapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
public class User {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String profession;
    @OneToMany
    @JoinColumn(name = "posts", referencedColumnName = "id")
    private List<Post> postList;
}
