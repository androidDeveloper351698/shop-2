package com.shop.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shop.domain.Person;

@RepositoryRestResource
@RepositoryDefinition(domainClass=Person.class, idClass=Long.class)
public interface PersonRepository extends CrudRepository<Person, Long>{

}
