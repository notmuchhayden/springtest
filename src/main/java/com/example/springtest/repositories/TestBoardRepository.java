package com.example.springtest.repositories;

import com.example.springtest.entities.TestBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestBoardRepository extends JpaRepository<TestBoard, Integer> {
}
