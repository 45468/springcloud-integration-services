# 服务网关

### 网关的默认路由规则
```text
    默认情况下, Zuul会代理所有注册到Eureka Server的微服务, 并且Zuul的路由规则如下：http://ZUUL_HOST:ZUUL_PORT/微服务在Eureka上的serviceId/** 会被转发到serviceId对应的微服务.
    
    如： 
        订单系统的更新原始访问接口：
            http://localhost:8810/order/update/10
        加入zuul网关后的访问接口:         
            http://localhost:8600/scis-order-service/order/update/10
```

&nbsp;

### 设置自定义路由规则
```text
    zuul.routes.answerrule.path=/answer/**
    zuul.routes.answerrule.url=http://www.baidu.com/
    
    如：
        http://localhost:8600/answer/**  
        https://www.baidu.com/**
```