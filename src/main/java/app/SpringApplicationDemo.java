package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@ComponentScan
@EnableAsync
public class SpringApplicationDemo {
    public static void main(String[] args) throws Exception{
        ConfigurableApplicationContext context = SpringApplication.run(SpringApplicationDemo.class,args);

        context.getBean(CountNumber.class).PrintNumber();
        for(int i=1; i<10; i++){
            TimeUnit.MICROSECONDS.sleep(1);
            System.out.println("------------------");
        }
        context.close();
    }
}
