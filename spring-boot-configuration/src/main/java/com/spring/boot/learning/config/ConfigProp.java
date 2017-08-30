package com.spring.boot.learning.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author lizhiming  2017/8/30 14:49
 */
@Component
public class ConfigProp {


    @Value("${user.firstname}")
    private String userName;

    @Value("${user.phone}")
    private String userPhone;

    @Value("${user.desc}")
    private String userDesc;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }
}
