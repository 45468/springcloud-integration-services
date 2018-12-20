package com.xiwei.scis.order.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by L.Answer on 2018-12-20 15:16
 *
 * 积分系统容错处理类, 当调用远程积分系统接口失败或超时时, 会调用该类对应接口的容错逻辑
 */
@Component
public class IntegralServiceFallBack implements IntegralService {
    private static final Logger LOGGER = LoggerFactory.getLogger(IntegralServiceFallBack.class);

    @Override
    public int updateIntegralByOrderId(String orderId) {
        LOGGER.info("积分系统接口不可用, 服务降级并记录数据库, orderID: {}.", orderId);
        return -1;
    }
}