package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TutorialRepository extends JpaRepository<com.example.demo.model.Tutorial, Long> {
  List<com.example.demo.model.Tutorial> findByPublished(boolean published);

  List<com.example.demo.model.Tutorial> findByTitleContaining(String title);
}
