package com.example.demo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<com.example.demo.model.Comment, Long> {
  List<com.example.demo.model.Comment> findByTutorialId(Long postId);
  
  @javax.transaction.Transactional
  void deleteByTutorialId(long tutorialId);
}
