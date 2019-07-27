package com.example.ticketManager.repository;

import com.example.ticketManager.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OperatorRepo extends JpaRepository<Operator, Long> {

    @Query("select op.id, op.name from Operator op")
    Long getOperatorIdByName(String name);
}
