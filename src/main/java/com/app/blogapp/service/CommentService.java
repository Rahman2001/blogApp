package com.app.blogapp.service;


import com.app.blogapp.domain.Comment;
import com.app.blogapp.repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepo commentRepo;

    @Autowired
    public CommentService(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }

    public List<Comment> findCommentsByPostId(long postId) {
        return this.commentRepo.findAllByPostId(postId);
    }
}
