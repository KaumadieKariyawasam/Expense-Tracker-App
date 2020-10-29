package com.example.vizu.abc.repository;

import com.example.vizu.abc.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long>{
    Category findByName(String name);
}
