package com.wanted.preonboarding.theater.service;

import org.springframework.stereotype.Service;

import com.wanted.preonboarding.theater.service.handler.Audience;
import com.wanted.preonboarding.theater.service.handler.Bag;
import com.wanted.preonboarding.theater.service.handler.Theater;
import com.wanted.preonboarding.theater.service.handler.Ticket;
import com.wanted.preonboarding.theater.service.handler.TicketOffice;
import com.wanted.preonboarding.theater.service.handler.TicketSeller;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TheaterService {
	private final Theater theater;

	public String enter() {
		theater.enter(new Audience(new Bag(1000L)),
			new TicketSeller(new TicketOffice(20000L, new Ticket(100L))));
		return "Have a good time.";

	}
}
