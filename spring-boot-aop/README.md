##### 1、spring-boot-aop，使用aop，面向切面编程
    模块选择：web、aop
    application.yml配置
    spring
        aop
            auto: true              //属性默认是开启的
            proxy-target-class: false，//如果需要使用cglib需要设置为true
    默认用的是jdk-proxy
    设置false表示启用cglib来实现aop        
[可参考文章](http://blog.didispace.com/springbootaoplog/)

```
spring-boot应用aop,需要在pom.xml下引入：
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-aop</artifactId>
    </dependency>

```


