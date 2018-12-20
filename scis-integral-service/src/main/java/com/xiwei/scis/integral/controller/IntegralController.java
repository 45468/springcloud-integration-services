package com.xiwei.scis.integral.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by L.Answer on 2018-12-17 20:09
 */
@RestController
@RequestMapping(value = "/integral")
public class IntegralController {
    public static final Logger LOGGER = LoggerFactory.getLogger(IntegralController.class);

    @PostMapping(value = "/update/{orderId}")
    public int updateIntegralByOrderId(@PathVariable("orderId") String orderId) {
        LOGGER.info("integral orderId: {}.", orderId);
        return 1;
    }

}