package com.app.blogapp.controller;

import com.app.blogapp.domain.Comment;
import com.app.blogapp.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {
    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/getCommentsByPost/{post_id}")
    public ResponseEntity<List<Comment>> getAllComments(@PathVariable("post_id") long post_id) {
        List<Comment> comments = this.commentService.findCommentsByPostId(post_id);
        return comments != null && !comments.isEmpty() ?
                ResponseEntity.ok(comments) : ResponseEntity.notFound().build();

    }

    @PostMapping("/addCommentToPost")
    public ResponseEntity<Comment> addComment(@RequestBody Comment comment) {
        Comment resp = this.commentService.addCommentToPost(comment);
        return resp != null ? ResponseEntity.ok(resp) : ResponseEntity.notFound().build();
    }
}
