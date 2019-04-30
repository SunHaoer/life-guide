package pro.sunhao.goldguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sunhao.goldguide.info.GoldPriceAPIConfig;
import pro.sunhao.goldguide.service.HandlerService;

@RestController
@PropertySource(value = "classpath:APIConfig.properties")
public class TestController {

    @Value("${api.goldprice.host}")
    public String HOST;

    @Autowired
    private HandlerService handlerService;

    @RequestMapping(value="/test")
    public String test() {
        System.out.println(HOST);

        return "Hello World";
    }

}
