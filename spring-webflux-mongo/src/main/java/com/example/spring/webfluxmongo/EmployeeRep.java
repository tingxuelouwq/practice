package com.example.spring.webfluxmongo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRep extends ReactiveCrudRepository<Employee,String> {
}
