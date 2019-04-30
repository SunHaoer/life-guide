package pro.sunhao.goldguide;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("pro.sunhao.goldguide.dao")
public class GoldguideApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoldguideApplication.class, args);
    }

}
