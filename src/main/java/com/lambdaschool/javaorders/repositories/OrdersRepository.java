package com.lambdaschool.javaorders.repositories;

import com.lambdaschool.javaorders.models.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Long>
{
}
