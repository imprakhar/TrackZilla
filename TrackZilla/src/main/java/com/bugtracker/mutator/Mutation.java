package com.bugtracker.mutator;

import com.bugtracker.Entity.Application;
import com.bugtracker.Repository.ApplicationRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {
    private ApplicationRepository applicationRepository;

    public Mutation(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application newApplication(String name, String owner,
                                      String description) {
        Application app = new Application(name, owner, description);
        applicationRepository.save(app);
        return app;
    }

    public boolean deleteApplication(Long id) {
        applicationRepository.deleteById(id);
        return true;
    }

    public Application updateApplicationOwner(String newOwner, Long id) throws Exception {
        Optional<Application> optionalApplication = applicationRepository.findById(id);

        if(optionalApplication.isPresent()) {
            Application application = optionalApplication.get();
            application.setOwner(newOwner);
            applicationRepository.save(application);
            return application;
        } else {
            throw new Exception();
        }
    }
}

