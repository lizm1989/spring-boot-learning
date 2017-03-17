可参考文章：
http://blog.didispace.com/springbootaoplog/

spring-boot应用aop,需要在pom.xml下引入：
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-aop</artifactId>
    </dependency>


配置：

#引入后默认为true
spring.aop.auto=true

#默认用的是jdk-proxy
#设置false表示启用cglib来实现aop
spring.aop.proxy-target-class=false


#####


