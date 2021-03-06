package org.sdswamy.demo.spring.fundamentals.repository;

import org.sdswamy.demo.spring.fundamentals.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
