package com.xiwei.scis.order.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by L.Answer on 2018-12-20 15:23
 *
 * 库存系统容错处理类, 当调用远程库存系统接口失败或超时时, 会调用该类对应接口的容错逻辑
 */
@Component
public class InventoryServiceFallBack implements InventoryService {
    private static final Logger LOGGER = LoggerFactory.getLogger(InventoryServiceFallBack.class);

    @Override
    public int updateInventoryByOrderId(String orderId) {
        LOGGER.info("库存系统接口不可用, 服务降级并记录数据库, orderID: {}.", orderId);
        return -1;
    }
}