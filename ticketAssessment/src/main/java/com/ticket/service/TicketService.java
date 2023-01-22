package com.ticket.service;

import java.util.List;

import org.springframework.stereotype.Component;


import com.ticket.model.Ticket;
@Component
public interface TicketService {
	List<Ticket> getAllTicket();
	void saveTicket(Ticket ticket);
	Ticket getTicketById(int id);
	void deleteTicketById(int id);
	public List<Ticket> getByKeyword(String keyword);

}