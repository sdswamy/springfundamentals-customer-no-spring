package org.sdswamy.demo.spring.fundamentals.service;

import org.sdswamy.demo.spring.fundamentals.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
