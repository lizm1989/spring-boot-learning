##### spring-boot-redis

依赖：
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-redis</artifactId>
</dependency>
    
    
### application.yml配置   
```
server:
  port: 7878

spring:
    redis:
      database: 0 #Redis数据库索引（默认为0）
      host: 127.0.0.1 #Redis服务器地址
      password: xxxx #Redis服务器连接密码（默认为空）
      port: 6379 #Redis服务器连接端口
      pool:
        max-active: 8 #连接池最大连接数（使用负值表示没有限制）
        max-wait: 1 #连接池最大阻塞等待时间（使用负值表示没有限制）
        min-idle: 0 #连接池中的最小空闲连接
        max-idle: 8 #连接池中的最大空闲连接
      timeout: 3000 #连接超时时间（毫秒）
```