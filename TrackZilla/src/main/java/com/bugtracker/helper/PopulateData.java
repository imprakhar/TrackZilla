package com.bugtracker.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bugtracker.Entity.Application;
import com.bugtracker.Repository.ApplicationRepository;
import com.bugtracker.Repository.ReleaseRepository;
import com.bugtracker.Repository.TicketRepository;

@Component
public class PopulateData implements CommandLineRunner {
	
	@Autowired
	ApplicationRepository applicationRepository;
	
	@Autowired
	TicketRepository ticketRepository;
	
	@Autowired
	ReleaseRepository repository;

	@Override
	public void run(String... args) throws Exception {
		applicationRepository.save(new Application("Trackzilla", "A bug tracking application", "Prakhar Fanse"));
		applicationRepository.save(new Application("Expenses", "An application used to submit expenses", "Gary Norcross"));
		applicationRepository.save(new Application("Bookings", "An application used to book tickets", "Ido Geladi"));
		applicationRepository.save(new Application("Invoice Search", "An application used to search invoices", "Sourabh Goyal"));
		applicationRepository.save(new Application("Audits", "An application used for auditing purposes", "Vijay Patwa"));
	}

}
