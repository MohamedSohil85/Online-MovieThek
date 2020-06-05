package com.mohamed.movieticketsystem.repositories;

import com.mohamed.movieticketsystem.entities.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrdersRepository extends CrudRepository<Orders,Long> {
Optional<Orders>findByUserName(String username);
    
}
