package org.sdswamy.demo.spring.fundamentals.repository;

import org.sdswamy.demo.spring.fundamentals.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Tom");
        customer.setFirstName("Jerry");

        customers.add(customer);

        return customers;
    }
}
