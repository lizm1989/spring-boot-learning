# spring-boot-learning

###  工程生成依赖：http://start.spring.io/
###   每个工程的说明文件地址：/resources/static/readme.txt

##### 1、spring-boot-aop，使用aop，面向切面编程
    模块选择：web、aop
    application.yml配置
    spring
        aop
            auto: true              //属性默认是开启的
            proxy-target-class: false，//如果需要使用cglib需要设置为true
    
    
   具体例子可查看：
    [WebAspect.java](https://github.com/lizm1989/spring-boot-learning/blob/master/spring-boot-aop/src/main/java/com/spring/boot/learning/config/WebAspect.java)
    [WebRuntimeAspect.java](https://github.com/lizm1989/spring-boot-learning/blob/master/spring-boot-aop/src/main/java/com/spring/boot/learning/config/WebRuntimeAspect.java)
    
    
##### 2、spring-boot-banner，自定义   resources/banner.txt

    banner.txt内容如下
    
    ${AnsiColor.BRIGHT_YELLOW}
    ////////////////////////////////////////////////////////////////////
    //                          _ooOoo_                               //
    //                         o8888888o                              //
    //                         88" . "88                              //
    //                         (| ^_^ |)                              //
    //                         O\  =  /O                              //
    //                      ____/`---'\____                           //
    //                    .'  \\|     |//  `.                         //
    //                   /  \\|||  :  |||//  \                        //
    //                  /  _||||| -:- |||||-  \                       //
    //                  |   | \\\  -  /// |   |                       //
    //                  | \_|  ''\---/''  |   |                       //
    //                  \  .-\__  `-`  ___/-. /                       //
    //                ___`. .'  /--.--\  `. . ___                     //
    //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
    //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
    //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
    //      ========`-.____`-.___\_____/___.-`____.-'========         //
    //                           `=---='                              //
    //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
    //            佛祖保佑       永不宕机     永无BUG                  //
    ////////////////////////////////////////////////////////////////////
    ${AnsiColor.BRIGHT_RED}
    Application Version: ${application.version}${application.formatted-version}
    Spring Boot Version: ${spring-boot.version}${spring-boot.formatted-version}


####  3、spring-boot-security，安全控制


