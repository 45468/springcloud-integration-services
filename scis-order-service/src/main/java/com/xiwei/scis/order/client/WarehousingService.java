package com.xiwei.scis.order.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by L.Answer on 2018-12-20 10:44
 * 仓储系统接口
 */
@FeignClient(name = "scis-warehousing-service", fallback = WarehousingServiceFallBack.class)
public interface WarehousingService {

    @RequestMapping(value = "feign/warehousing/{orderId}", method = RequestMethod.POST, consumes = "application/json")
    int updateWarehousingByOrderId(@PathVariable("orderId") String orderId);

}