package com.example.ms_order_btg.dto;

import com.example.ms_order_btg.factory.OrderEntityFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderResponseTest {

    @Test
    void shouldMapCorrectly() {
        // ARRANGE
        var input = OrderEntityFactory.build();

        // ACT
        var output = OrderResponse.fromEntity(input);

        // ASSERT
        assertEquals(input.getOrderId(), output.orderId());
        assertEquals(input.getCustomerId(), output.customerId());
        assertEquals(input.getTotal(), output.total());
    }
}