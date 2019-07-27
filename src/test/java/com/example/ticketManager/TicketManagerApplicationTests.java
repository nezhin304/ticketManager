package com.example.ticketManager;

import com.example.ticketManager.entity.Operator;
import com.example.ticketManager.entity.Ticket;
import com.example.ticketManager.repository.OperatorRepo;
import com.example.ticketManager.repository.TicketRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TicketManagerApplicationTests {

	@Autowired
	TicketRepo ticketRepo;
	@Autowired
	OperatorRepo operatorRepo;

	@Test
	public void contextLoads() throws ParseException {

//		Ticket ticket = new Ticket();
//		ticket.setDateOpen(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-07-27 12:00:00"));
//		ticket.setTtNumber("TT123456789");
//		Operator operator = new Operator();
//		operator.setName("BITAF");
//		List<Ticket> tickets = new ArrayList<>();
//		tickets.add(ticket);
//		operator.setTickets(tickets);
//		ticket.setOperator(operator);

//		operatorRepo.save(operator);
//		ticketRepo.save(ticket);


		Ticket ticket1 = new Ticket();
		ticket1.setDateOpen(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-07-27 15:00:00"));
		ticket1.setTtNumber("TT090897867665");
		Long operatorId = operatorRepo.getOperatorIdByName("BITAF");
		Operator operator1 = operatorRepo.getOne(operatorId);
		ticket1.setOperator(operator1);
		ticketRepo.save(ticket1);

	}

}
