package com.xiwei.scis.order.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by L.Answer on 2018-12-20 10:44
 * 库存系统接口
 */
@FeignClient(name = "scis-inventory-service", fallback = InventoryServiceFallBack.class, configuration = InventoryServiceConfiguration.class)
public interface InventoryService {

    /**
     * consumes: 指定处理请求的提交内容类型(Content-Type), 例如application/json, text/html;
     * */
    @RequestMapping(value = "inventory/update/{orderId}", method = RequestMethod.POST, consumes = "application/json")
    int updateInventoryByOrderId(@PathVariable("orderId") String orderId);

}