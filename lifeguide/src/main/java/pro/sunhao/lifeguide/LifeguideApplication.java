package pro.sunhao.lifeguide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("pro.sunhao.lifeguide.dao")
public class LifeguideApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifeguideApplication.class, args);
    }

}
