package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customers;
import com.lambdaschool.javaorders.models.Orders;
import com.lambdaschool.javaorders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "ordersService")
public class OrdersServiceImpl implements OrdersService
{
    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Orders findOrdersById(long id)
    {
        return ordersRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Order " + id + " Not Found "));
    }
}
