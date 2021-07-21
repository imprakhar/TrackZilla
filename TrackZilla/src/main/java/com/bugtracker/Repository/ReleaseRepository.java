package com.bugtracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bugtracker.Entity.Release;

@Repository
public interface ReleaseRepository extends JpaRepository<Release, Long> {

}
