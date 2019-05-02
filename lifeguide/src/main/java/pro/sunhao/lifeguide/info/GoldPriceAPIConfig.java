package pro.sunhao.lifeguide.info;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@Component
@PropertySource("classpath:APIConfig.properties")
public class GoldPriceAPIConfig {

    @Value("${api.goldprice.host}")
    private String host;

    @Value("${api.goldprice.path}")
    private String path;

    @Value("${api.goldprice.method}")
    private String method;

    @Value("${api.goldprice.appcode}")
    private String appcode;

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getMethod() {
        return method;
    }

    public String getAppcode() {
        return appcode;
    }

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
