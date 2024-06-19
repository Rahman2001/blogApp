package com.app.blogapp.repo;

import com.app.blogapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByIdAndEmail(Long id, String email);
}
