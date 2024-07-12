package com.example.ms_order_btg.repository;

import com.example.ms_order_btg.dto.OrderResponse;
import com.example.ms_order_btg.entity.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
    Page<OrderEntity> findAllByCustomerId(Long customerId, PageRequest pageRequest);
}
