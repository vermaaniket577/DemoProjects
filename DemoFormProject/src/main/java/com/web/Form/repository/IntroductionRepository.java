package com.web.Form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.Form.model.Introduction;

public interface IntroductionRepository extends JpaRepository<Introduction, Long> {
    Introduction findByName(String name);
}
