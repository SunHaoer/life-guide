package pro.sunhao.lifeguide.info;

import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;

@Getter
@Configuration
@Component
@PropertySource("classpath:APIConfig.properties")
public class GoldPriceAPIConfig extends APIConfig {

    @Value("${api.goldprice.host}")
    private String host;

    @Value("${api.goldprice.path}")
    private String path;

    @Value("${api.goldprice.method}")
    private String method;

    @Value("${api.goldprice.appcode}")
    private String appcode;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"host\":\"")
                .append(host).append('\"');
        sb.append(",\"path\":\"")
                .append(path).append('\"');
        sb.append(",\"method\":\"")
                .append(method).append('\"');
        sb.append(",\"appcode\":\"")
                .append(appcode).append('\"');
        sb.append('}');
        return sb.toString();
    }

}
