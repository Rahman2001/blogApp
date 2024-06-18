package com.app.blogapp.service;

import com.app.blogapp.domain.Post;
import com.app.blogapp.domain.User;
import com.app.blogapp.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepo postRepo;

    @Autowired
    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    public List<Post> findAllByAuthor(User user) {
        return postRepo.findAllByAuthor_Email(user.getEmail());
    }

    public Post addPostForUser(Post post) {
        return this.postRepo.save(post);
    }

    public boolean deletePostById(Long id) {
        this.postRepo.deleteById(id);
        return this.postRepo.existsById(id);
    }
}
