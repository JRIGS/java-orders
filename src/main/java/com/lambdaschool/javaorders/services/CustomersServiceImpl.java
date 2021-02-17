package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customers;
import com.lambdaschool.javaorders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service(value = "customersService")
public class CustomersServiceImpl implements CustomersService
{
    @Autowired
    private CustomersRepository customersRepository;

    @Override
    public List<Customers> findAllCustomers()
    {
        List<Customers> returnList = new ArrayList<>();

        customersRepository.findAll().iterator().forEachRemaining(returnList::add);
        return returnList;
    }

    @Override
    public Customers findCustomerById(long id)
    {
        return customersRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Customer " + id + " Not Found "));
    }

    @Override
    public List<Customers> findByNameLike(String queriedname)
    {
        return customersRepository.findCustomersByCustomernameContaining(queriedname);
    }
}
