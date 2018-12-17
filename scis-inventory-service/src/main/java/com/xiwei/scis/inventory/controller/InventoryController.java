package com.xiwei.scis.inventory.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by L.Answer on 2018-12-17 20:08
 */
@RestController
public class InventoryController {

    @Value("${config.file.name}")
    private String configFileName;

    @RequestMapping("/index")
    public String index() {
        return "configFileName: " + configFileName;
    }

}