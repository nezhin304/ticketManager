package com.example.ticketManager.controller;

import com.example.ticketManager.entity.Ticket;
import com.example.ticketManager.repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TicketController {
    @Autowired
    private TicketRepo repository;

    @GetMapping("/")
    public String allTickets(Model model) {
        List<Ticket> tickets = repository.findAll();
        model.addAttribute("tickets", tickets);
        return "all_tickets";
    }
}
