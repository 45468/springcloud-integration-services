package com.xiwei.scis.order.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by L.Answer on 2018-12-20 15:24
 *
 * 仓储系统容错处理类, 当调用远程仓储系统接口失败或超时时, 会调用该类对应接口的容错逻辑
 */
@Component
public class WarehousingServiceFallBack implements WarehousingService {
    private static final Logger LOGGER = LoggerFactory.getLogger(WarehousingServiceFallBack.class);

    @Override
    public int updateWarehousingByOrderId(String orderId) {
        LOGGER.info("仓储系统服务降级, orderID: {}.", orderId);
        return -1;
    }
}