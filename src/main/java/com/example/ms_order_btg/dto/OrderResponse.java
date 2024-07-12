package com.example.ms_order_btg.dto;

import com.example.ms_order_btg.entity.OrderEntity;
import org.springframework.core.annotation.Order;

import java.math.BigDecimal;

public record OrderResponse(Long orderId,
                            Long customerId,
                            BigDecimal total) {

    public static OrderResponse fromEntity(OrderEntity entity) {
        return new OrderResponse(entity.getOrderId(), entity.getCustomerId(), entity.getTotal());
    }
}
