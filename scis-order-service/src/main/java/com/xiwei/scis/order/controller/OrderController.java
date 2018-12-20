package com.xiwei.scis.order.controller;

import com.xiwei.scis.order.client.IntegralService;
import com.xiwei.scis.order.client.InventoryService;
import com.xiwei.scis.order.client.WarehousingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by L.Answer on 2018-12-17 15:27
 */
@RestController
public class OrderController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private InventoryService inventoryService;
    @Autowired
    private WarehousingService warehousingService;
    @Autowired
    private IntegralService integralService;


    @RequestMapping("/order/update/{orderId}")
    public String updateOrderByOrderId(@PathVariable("orderId") String orderId) {
        LOGGER.info("update order by orderID: {}.", orderId);

        int inventoryByOrderId =inventoryService.updateInventoryByOrderId(orderId);
        LOGGER.info("【库存】系统更新{}啦, 返回值： {}.", (inventoryByOrderId == -1) ? "失败" : "成功", inventoryByOrderId);

        int warehousingByOrderId = warehousingService.updateWarehousingByOrderId(orderId);
        LOGGER.info("【仓储】系统更新{}啦, 返回值： {}.", (warehousingByOrderId == -1) ? "失败" : "成功", warehousingByOrderId);

        int integralByOrderId = integralService.updateIntegralByOrderId(orderId);
        LOGGER.info("【积分】系统更新{}啦, 返回值： {}.", (integralByOrderId == -1) ? "失败" : "成功", integralByOrderId);

        return "success";
    }

}