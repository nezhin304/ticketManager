package com.example.ticketManager.repository;

import com.example.ticketManager.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperatorRepo extends JpaRepository<Operator, Long> {
}
