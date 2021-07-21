package com.bugtracker.Resolver;

import org.springframework.stereotype.Component;

import com.bugtracker.Entity.Application;
import com.bugtracker.Repository.ApplicationRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class Query implements GraphQLQueryResolver {
	    private ApplicationRepository applicationRepository;

	    public Query(ApplicationRepository applicationRepository) {
	        this.applicationRepository = applicationRepository;
	    }

	    public Iterable<Application> findAllApplications() {
	        return applicationRepository.findAll();
	    }

	    public long countApplications() {
	        return applicationRepository.count();
	    }

}
