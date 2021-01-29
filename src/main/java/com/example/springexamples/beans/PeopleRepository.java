package com.example.springexamples.beans;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends CrudRepository<ExampleEntity, Long> {
}
