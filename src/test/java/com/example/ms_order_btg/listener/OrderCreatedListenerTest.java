package com.example.ms_order_btg.listener;

import com.example.ms_order_btg.factory.OrderCreatedEventFactory;
import com.example.ms_order_btg.service.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.messaging.support.MessageBuilder;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class OrderCreatedListenerTest {

    @Mock
    OrderService orderService;

    @InjectMocks
    OrderCreatedListener orderCreatedListener;

    @Test
    void shouldCallServiceWithCorrectParameters() {
        // ARRANGE
        var event = OrderCreatedEventFactory.buildWithOneItem();
        var message = MessageBuilder.withPayload(event).build();

        // ACT
        orderCreatedListener.listen(message);

        // ASSERT
        verify(orderService, times(1)).save(eq(message.getPayload()));
    }

}