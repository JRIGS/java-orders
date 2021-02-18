package com.lambdaschool.javaorders.repositories;

import com.lambdaschool.javaorders.models.Customers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomersRepository extends CrudRepository<Customers, Long>
{
    List<Customers> findCustomersByCustnameContaining(String queriedname);
}
