package com.zl1030;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/test")
public class TestController {
    @Value("${welcome-message:unknown}")
    private String message;

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        System.out.println(message);
        return message;
    }
}
