package pro.sunhao.lifeguide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sunhao.lifeguide.service.GoldPriceDataService;
import pro.sunhao.lifeguide.service.WeatherDataService;

@RestController
@PropertySource(value = "classpath:APIConfig.properties")
public class TestController {

    @Autowired
    private WeatherDataService weatherDataService;

    @Autowired
    private GoldPriceDataService goldPriceDataService;

    @RequestMapping(value="/test")
    public String test() {
        //goldPriceDataService.getGoldPriceData();
        weatherDataService.getWeatherData();
        return "Hello World";
    }

}
