package com.example.springEvents.listner;

import com.example.springEvents.event.OrderEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EventWithErrorExample
{
    @EventListener
    @Async
    public void throwFakeError(OrderEvent event)throws Exception
    {
        System.out.println("Fake error Thread: "+Thread.currentThread().getName());
        throw new Exception("Error");
    }
}
