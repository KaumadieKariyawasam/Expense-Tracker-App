package com.example.vizu.abc.repository;

import com.example.vizu.abc.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
