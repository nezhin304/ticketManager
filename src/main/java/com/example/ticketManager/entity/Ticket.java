package com.example.ticketManager.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ttNumber;
    private Date dateOpen;
    @ManyToOne
    @JoinColumn(name = "operator_id", nullable = false)
    private Operator operator;

    public Ticket() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTtNumber() {
        return ttNumber;
    }

    public void setTtNumber(String ttNumber) {
        this.ttNumber = ttNumber;
    }

    public Date getDateOpen() {
        return dateOpen;
    }

    public void setDateOpen(Date dateOpen) {
        this.dateOpen = dateOpen;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
