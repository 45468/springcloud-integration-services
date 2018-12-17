# Spring-Cloud-Config 配置管理服务
```properties
    # 配置文件名称
    application: scis-order-service

    # 如果不设置此值, 则系统设置此值为 spring.profiles.active 属性的值
    profile: prod

    # 配置文件所在分支, 可以使用之前的版本. 默认值可以是git label, branch name or commit id. 可以使用多个Label, 多个Label可以使用逗号分隔
    label: master
```
 - /{application}/{profile}[/{label}]
   - http://localhost:7072/scis-order-service/prod/master
   - http://localhost:7072/scis-order-service/prod
  
 - /{application}-{profile}.yml
   - http://localhost:7072/scis-order-service-prod.yaml
   
 - /{label}/{application}-{profile}.yml
   - http://localhost:7072/master/scis-order-service-prod.yaml
   
 - /{application}-{profile}.properties
   - http://localhost:7072/scis-order-service-prod.properties
   
 - /{label}/{application}-{profile}.properties
   - http://localhost:7072/master/scis-order-service-prod.properties

