package com.xiwei.scis.order.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by L.Answer on 2018-12-20 10:40
 * 积分系统接口
 *
 * configuration: Feign配置类, 可以自定义Feign的Encoder、Decoder、LogLevel、Contract
 * fallback: 定义容错的处理类, 当调用远程接口失败或超时时, 会调用对应接口的容错逻辑, fallback指定的类必须实现@FeignClient标记的接口
 * fallbackFactory: 工厂类, 用于生成fallback类示例, 通过这个属性我们可以实现每个接口通用的容错逻辑, 减少重复的代码
 */
@FeignClient(name = "scis-integral-service", fallback = IntegralServiceFallBack.class)
public interface IntegralService {

    @RequestMapping(value = "feign/integral/{orderId}", method = RequestMethod.POST, consumes = "application/json")
    int updateIntegralByOrderId(@PathVariable("orderId") String orderId);
}