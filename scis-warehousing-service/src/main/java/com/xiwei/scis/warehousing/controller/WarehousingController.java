package com.xiwei.scis.warehousing.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by L.Answer on 2018-12-17 20:10
 */
@RestController
@RequestMapping(value = "/warehousing")
public class WarehousingController {
    private static final Logger LOGGER = LoggerFactory.getLogger(WarehousingController.class);

    @PostMapping("/update/{orderId}")
    public int updateWarehousingByOrderId(@PathVariable("orderId") String orderId) {
        LOGGER.info("warehousing orderId: {}.", orderId);
        return 1;
    }

}