package com.ok.spring.repositories;

import com.ok.spring.models.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface PersonRespository extends ReactiveMongoRepository<Person, String> {
    Flux<Person> findByName(String name);
}
