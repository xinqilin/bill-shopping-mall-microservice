# bill-shopping-mall-microservice

### setup
- vagrant
- vagrant init ubuntu/xenial64
- vagrant up
- docker pull mysql:5.7
- docker run 
  --name mysql 
  -d mysql:5.7 
  -p 3307:3306 
  -v /mydata/mysql/log:/var/log/mysql
  -v /mydata/mysql/data:/var/lib/mysql
  -v /mydata/mysql/conf:/etc/mysql
  -e MYSQL_ROOT_PASSWORD=root
- mkdir -p /mydata/redis/conf
- touch /mydata/redis/conf/redis.conf
- docker run -p 6379:6379 --name redis -v /mydata/redis/data:/data -v /mydata/redis/conf/redis.conf:/etc/redis/redis.conf -d redis redis-server /etc/redis/redis.conf
- docker exec -it redis redis-cli
- cd /mydata/redis/conf/
- vi redis.conf 
- appendonly yes (persistence)

### database
- order
- product
- sale
- ware
- user 

### module
- common
- coupon
- member
- order
- product
- ware

### 對應 Spring cloud
- spring cloud eureka  註冊中心 => nacos
- spring cloud ribbon Load Balance
- spring cloud feign http調用 
- spring cloud config 配置中心
- spring cloud zuul 網關
- spring cloud hystrix 熔斷 => sentinel 
- spring cloud gateway 路由 webflex
- spring cloud sleuth 監控


### Gateway works

```
                    Route、 Predicate
     Client     => Spring Cloud Gateway  =>    Service 
------------------------------------------------------------
Gateway Client
                 => Gateway Handler Mapping
                 => Gateway WebHandler Handler
                 => Filter
                 => Filter
                 =>  ...(無數個Filter)
                                               Proxied Service 
------------------------------------------------------------

```

Spring Cloud Example Reference : <a href="https://cloud.spring.io/spring-cloud-gateway/multi/multi_gateway-request-predicates-factories.html" alt="Spring Cloud"> 點我</a>


```yaml
    spring:
      cloud:
        gateway:
          routes:
          - id: after_route
            uri: https://example.org
            predicates:
            - After=2017-01-20T17:42:47.789-07:00[America/Denver]
```