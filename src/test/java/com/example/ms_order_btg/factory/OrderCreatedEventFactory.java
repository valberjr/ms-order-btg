package com.example.ms_order_btg.factory;

import com.example.ms_order_btg.dto.OrderCreatedEvent;
import com.example.ms_order_btg.dto.OrderItemEvent;

import java.math.BigDecimal;
import java.util.List;

public class OrderCreatedEventFactory {

    public static OrderCreatedEvent build() {
        var items = new OrderItemEvent("macbook", 1, BigDecimal.valueOf(20.50));

        return new OrderCreatedEvent(1L, 2L, List.of(items));
    }
}
