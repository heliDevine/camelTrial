package com.example.camelTrial;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FirstRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:firstExample?fixedRate=true&period=10000")
                .id("Timer route number 1")
                .log("Hello this is timer example, sends message every 10 seconds")
                .end();

        from("timer:firstExample?fixedRate=true&period=10000")
                .id("Timer route number 2")
                .log("Hello this is timer example from second route, sends message every 10 seconds")
                .end();
    }
}
