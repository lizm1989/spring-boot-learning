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
    
    
   示例代码可查看：

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
    依赖：
    <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    
    
    
####  4、spring-boot-crontab，定时任务
    启动类添加：@EnableScheduling 注解
        @SpringBootApplication
        @EnableScheduling
        public class SpringBootCrontabApplication {
        
        	public static void main(String[] args) {
        		SpringApplication.run(SpringBootCrontabApplication.class, args);
        	}
        }
    
    2种方法：
    一、@Scheduled(cron = "*/6 * * * * ?")
      @Component
      public class SchedulingTask {
      
          private int count = 0;
      
          //每隔6秒打印一次
          @Scheduled(cron = "*/6 * * * * ?")
          private void process() {
              System.out.println("SchedulingTask这是第几次了：" + count++);
          }
      }
     
     二、 @Scheduled(fixedRate = 6000)
        @Component
        public class SchedulingFixedRateTask {
        
            private int count;
        
            //每隔6秒打印一次
            @Scheduled(fixedRate = 6000)
            private void printCount() {
                System.out.println("SchedulingFixedRateTask这是第几次了：" + count++);
            }
        }
