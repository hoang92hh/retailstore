package com.example.retailtstore.service;

import com.example.retailtstore.model.Customer;
import com.example.retailtstore.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//@Service
//public class RetailStoreUserDetails implements UserDetailsService {
//
//

//    @Autowired
//    private CustomerRepository  customerRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        List<Customer> customers = customerRepository.findByUsername(username);
//        if(customers.isEmpty()){
//            throw new UsernameNotFoundException("User detail not found for username = "+ username);
//
//        }
//        String password = customers.get(0).getPassword();
//        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
//        authorities.add(new SimpleGrantedAuthority(customers.get(0).getRole()));
//
//
//        return new User(username, password, authorities);
//    }
//}
