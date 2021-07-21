package com.bugtracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtracker.Entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
