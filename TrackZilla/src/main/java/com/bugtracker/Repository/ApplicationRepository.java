package com.bugtracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtracker.Entity.Application;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
