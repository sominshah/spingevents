# Spring Events

A tiny Spring Boot example showing how to publish and handle application events **asynchronously**.
It registers a `SimpleApplicationEventMulticaster` bean with a custom `ErrorHandler` to catch listener exceptions, defines an `OrderEvent` payload, and demonstrates a service that publishes the event when a new order is added. Three `@EventListener` methods (`logOrder`, `throwFakeError`, `handleOrderEvent`) are annotated with `@Async`, so they run on background threads (one of them intentionally throws an exception that is picked up by the multicaster’s error handler).

Usage notes:

* Enable async processing by adding `@EnableAsync` to your main/config class.
* Start the app and `POST /orders` to publish an `OrderEvent`; check console logs to see listener threads and the error handler output.
* You can add `@Order` to listeners or define a custom `TaskExecutor` to control ordering and thread pool behavior.

That's it — a focused demo of Spring events + async listeners with simple error handling.
