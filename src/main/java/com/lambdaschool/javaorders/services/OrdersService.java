package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Orders;

public interface OrdersService
{
    Orders findOrdersById(long id);
}
