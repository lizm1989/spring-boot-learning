##### 属性配置

application.yml

```
user.name:  lzm
user.phone: 1565
```

### 通过@Value("${属性名}") 获取
```
    @Value("${user.name}")
    private String userName;

    @Value("${user.phone}")
    private String userPhone;
```


### 多环境配置文件
```$xslt
在application.yml文件中通过spring.profiles.active属性来设置，其值对应{profile}值。
```