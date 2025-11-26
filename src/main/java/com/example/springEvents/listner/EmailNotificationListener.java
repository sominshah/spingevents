package com.example.springEvents.listner;

import com.example.springEvents.event.OrderEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationListener
{
    @EventListener
    @Async
    public void handleOrderEvent(OrderEvent event)throws Exception
    {
        Thread.sleep(10000);
        System.out.println("Sending email for new order Order Event: " + event);
        System.out.println(Thread.currentThread().getName());

    }
}
