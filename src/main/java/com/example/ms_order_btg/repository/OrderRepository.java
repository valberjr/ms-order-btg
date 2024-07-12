package com.example.ms_order_btg.repository;

import com.example.ms_order_btg.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}
