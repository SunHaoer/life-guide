package pro.sunhao.lifeguide.info;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Configuration
@PropertySource("classpath:APIConfig.properties")
public class WeatherAPIConfig extends APIConfig {

    @Value("${api.weather.host}")
    private String host;

    @Value("${api.weather.path}")
    private String path;

    @Value("${api.weather.method}")
    private String method;

    @Value("${api.weather.appcode}")
    private String appcode;

}
