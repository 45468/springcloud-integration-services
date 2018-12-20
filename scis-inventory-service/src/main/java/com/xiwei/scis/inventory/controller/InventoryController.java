package com.xiwei.scis.inventory.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by L.Answer on 2018-12-17 20:08
 */
@RestController
@RequestMapping(value = "/inventory")
public class InventoryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(InventoryController.class);


    @PostMapping("/update/{orderId}")
    public int updateIntegralByOrderId(@PathVariable("orderId") String orderId) {
        LOGGER.info("inventory orderId: {}.", orderId);
        return 1;
    }
}