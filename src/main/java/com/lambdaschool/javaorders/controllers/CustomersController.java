package com.lambdaschool.javaorders.controllers;


import com.lambdaschool.javaorders.models.Customers;
import com.lambdaschool.javaorders.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersController
{
    @Autowired
    private CustomersService customersService;

    @GetMapping(value = "/orders", produces = {"application/json"})
    public ResponseEntity<?> listAllCustomers()
    {
        List<Customers> myCustomers = customersService.findAllCustomers();
        return new ResponseEntity<>(myCustomers, HttpStatus.OK);
    }

    // http://localhost:2021/customers/customer/31
    @GetMapping(value = "/customer/{id}", produces = {"application/json"})
    public ResponseEntity<?> listCustomersById(@PathVariable long id)
    {
        Customers c = customersService.findCustomerById(id);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    // http://localhost:2021/customers/namelike/jef
    @GetMapping(value = "/namelike/{queriedname}", produces = {"application/json"})
    public ResponseEntity<?> listAllCustomersQueriedName(@PathVariable String queriedname)
    {
        List<Customers> myCustomers = customersService.findByNameLike(queriedname);
        return  new ResponseEntity<>(myCustomers, HttpStatus.OK);
    }
}
