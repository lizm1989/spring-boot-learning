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