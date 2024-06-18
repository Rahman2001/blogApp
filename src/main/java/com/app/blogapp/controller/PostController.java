package com.app.blogapp.controller;

import com.app.blogapp.domain.Post;
import com.app.blogapp.domain.User;
import com.app.blogapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/getPostsByUser")
    public ResponseEntity<List<Post>> getPosts(@RequestBody User user) {
        List<Post> posts = this.postService.findAllByAuthor(user);
        return posts != null && !posts.isEmpty() ?
                ResponseEntity.ok(posts) : ResponseEntity.notFound().build();
    }

    @PutMapping("/addPost")
    public ResponseEntity<Post> addPost(@RequestBody Post post) {
        Post resp = this.postService.addPostForUser(post);
        return resp != null ? ResponseEntity.ok(resp) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/removePost/{post_id}")
    public ResponseEntity<Post> removePost(@PathVariable Long post_id) {
        boolean isDeleted = this.postService.deletePostById(post_id);
        return isDeleted ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}
