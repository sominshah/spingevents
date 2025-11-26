package com.example.springEvents.listner;
import com.example.springEvents.event.OrderEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
@Component
public class LogOrderListener
{
    @EventListener
    @Async
    public void logOrder(OrderEvent order)throws Exception
    {
        Thread.sleep(3000);
        System.out.println("Logging Orders: Order ID: " + order.getOrderId());
        System.out.println(Thread.currentThread().getName());

    }
}
