package com.xiwei.scis.order.client;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by L.Answer on 2018-12-20 16:27
 */
@Configuration
public class IntegralServiceConfiguration {

    /**
     * NONE:    No logging (DEFAULT).
     * BASIC:   Log only the request method and URL and the response status code and execution time.
     * HEADERS: Log the basic information along with request and response headers.
     * FULL:    Log the headers, body, and metadata for both requests and responses.
     * */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }

}