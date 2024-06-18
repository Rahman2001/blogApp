package com.app.blogapp.repo;

import com.app.blogapp.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {
    @Query(value = "select p.comments from Post p where p.id =:postId", nativeQuery = true)
    public List<Comment> findAllByPostId(@Param("postId") Long postId);
}
