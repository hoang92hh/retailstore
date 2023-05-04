package com.example.retailtstore.controller;


import com.example.retailtstore.model.Customer;
import com.example.retailtstore.model.Greeting;
import com.example.retailtstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@RestController
@RequestMapping("/v1")
public class CustomerGreetingController {
    private static final String greetingTemmplate = "Hello, %s %s";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private CustomerService customerService;
    @GetMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "gender",defaultValue ="0") boolean gender
            ,@RequestParam(value = "customerName", defaultValue = "CustomerName") String customerName
    ){

       return Greeting.builder()
               .id(counter.incrementAndGet())
               .content(String.format(greetingTemmplate, gender?"Mr.": "Ms.",customerName ))
               .build();
    }
    @GetMapping("/getAllAcount")
    public ResponseEntity<?>  getAllAcount(
    ){
        ResponseEntity<List<Customer>> responseEntity = null;
        responseEntity = ResponseEntity.status(HttpStatus.OK).body(customerService.getAllCustomer());
        return responseEntity;
    }
}
