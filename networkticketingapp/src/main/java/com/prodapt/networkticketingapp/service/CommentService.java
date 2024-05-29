package com.prodapt.networkticketingapp.service;

import com.prodapt.networkticketingapp.entities.Comment;
import com.prodapt.networkticketingapp.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Optional<Comment> findById(Integer commentId) {
        return commentRepository.findById(commentId);
    }

    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteById(Integer commentId) {
        commentRepository.deleteById(commentId);
    }
}
