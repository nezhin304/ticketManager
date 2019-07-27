package com.example.ticketManager.repository;

import com.example.ticketManager.entity.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OperatorRepo extends JpaRepository<Operator, Long> {

    @Query("select op.id from Operator op where op.name=:name")
    Long getOperatorIdByName(@Param("name") String name);
}
