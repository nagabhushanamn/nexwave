package com.example.demo.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Story;

@Repository
@Transactional
public interface StoryRepository extends CrudRepository<Story, Integer> {

}
