package com.xiwei.scis.order;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by L.Answer on 2018-12-17 15:27
 */
@RestController
public class OrderController {

    @Value("${config.file.name}")
    private String configFileName;

    @RequestMapping("/orders")
    public String orders() {
        return "configFileName: " + configFileName;
    }

}