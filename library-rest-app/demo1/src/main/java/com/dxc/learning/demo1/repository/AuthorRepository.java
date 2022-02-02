package com.dxc.learning.demo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.learning.demo1.model.Author;

public interface AuthorRepository extends JpaRepository <Author ,Integer>{
    
}
