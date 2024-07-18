package com.example.ms_order_btg.factory;

import com.example.ms_order_btg.dto.OrderCreatedEvent;
import com.example.ms_order_btg.dto.OrderItemEvent;

import java.math.BigDecimal;
import java.util.List;

public class OrderCreatedEventFactory {

    public static OrderCreatedEvent buildWithOneItem() {
        var items = new OrderItemEvent("macbook", 1, BigDecimal.valueOf(20.50));

        return new OrderCreatedEvent(1L, 2L, List.of(items));
    }

    public static OrderCreatedEvent buildWithTwoItens() {
        var item1 = new OrderItemEvent("macbook", 1, BigDecimal.valueOf(20.50));
        var item2 = new OrderItemEvent("iphone", 1, BigDecimal.valueOf(35.25));

        return new OrderCreatedEvent(1L, 2L, List.of(item1, item2));
    }
}
