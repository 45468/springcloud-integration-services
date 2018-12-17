# SpringCloud 组件集成服务

### 壹、 业务系统分布说明
 - **订单系统**: [scis-order-service](https://github.com/AnswerAICode/springcloud-integration-services/tree/master/scis-order-service)
   - **集群端口分布**: 8810(`单节点`) - 8819
   
 - **库存系统**: [scis-inventory-service](https://github.com/AnswerAICode/springcloud-integration-services/tree/master/scis-inventory-service)
   - **集群端口分布**: 8820(`单节点`) - 8829
   
 - **仓储系统**: [scis-warehousing-service](https://github.com/AnswerAICode/springcloud-integration-services/tree/master/scis-warehousing-service)
   - **集群端口分布**: 8830(`单节点`) - 8839
   
 - **积分系统**: [scis-integral-service](https://github.com/AnswerAICode/springcloud-integration-services/tree/master/scis-integral-service)
   - **集群端口分布**: 8840(`单节点`) - 8849
  
&nbsp;

### 贰、 核心组件说明
 - **Eureka**: 各个服务启动时, Eureka Client都会将服务注册到Eureka Server, 并且Eureka Client还可以反过来从Eureka Server拉取注册表, 从而知道其他服务在哪里
   - **Eureka Client**: 负责将这个服务的信息注册到Eureka Server中
   - **Eureka Server**: 注册中心, 里面有一个注册表, 保存了各个服务所在的机器和端口号
   
 - **Feign**: 基于Feign的动态代理机制, 根据注解和选择的机器, 拼接请求URL地址, 发起请求
 
 - **Ribbon**: 服务间发起请求的时候, 基于Ribbon做负载均衡, 从一个服务的多台机器中选择一台
   - 作用是负载均衡, 会帮你在每次请求时选择一台机器, 均匀的把请求分发到各个机器上
   
 - **Hystrix**: 发起请求是通过Hystrix的线程池来走的, 不同的服务走不同的线程池, 实现了不同服务调用的隔离, 避免了服务雪崩的问题
   - 负责服务隔离、熔断、降级
   
 - **Zuul**: 如果前端、移动端要调用后端系统, 统一从Zuul网关进入, 由Zuul网关转发请求给对应的服务
   - 负责网络路由的





断路器聚合监控(Hystrix Turbine)

&nbsp;

### 附录 - 参考网址
  - [拜托！面试请不要再问我Spring Cloud底层原理](https://mp.weixin.qq.com/s/7cIpSV0dHV5jHdxF4Wdtgw)