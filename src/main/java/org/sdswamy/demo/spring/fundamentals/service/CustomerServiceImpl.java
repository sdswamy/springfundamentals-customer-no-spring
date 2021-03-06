package org.sdswamy.demo.spring.fundamentals.service;

import org.sdswamy.demo.spring.fundamentals.model.Customer;
import org.sdswamy.demo.spring.fundamentals.repository.CustomerRepository;
import org.sdswamy.demo.spring.fundamentals.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
