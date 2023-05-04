package com.example.retailtstore.service;

import com.example.retailtstore.model.Customer;
import com.example.retailtstore.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    PasswordEncoder encoder;

    public Customer createCustomer(Customer customer){
        customer.setPassword(encoder.encode(customer.getPassword()));
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomer(){
        List<Customer> customer =(List<Customer>) customerRepository.findAll();
        return customer;
    }
}
