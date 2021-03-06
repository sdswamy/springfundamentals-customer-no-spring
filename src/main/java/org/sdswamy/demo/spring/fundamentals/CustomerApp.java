package org.sdswamy.demo.spring.fundamentals;

import org.sdswamy.demo.spring.fundamentals.service.CustomerService;
import org.sdswamy.demo.spring.fundamentals.service.CustomerServiceImpl;

public class CustomerApp {

    public static void main( String[] args ) {

        CustomerService customerService = new CustomerServiceImpl();
        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}
