package com.prodapt.networkticketingapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodapt.networkticketingapp.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
