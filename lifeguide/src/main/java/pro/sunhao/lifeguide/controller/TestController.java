package pro.sunhao.lifeguide.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sunhao.lifeguide.dao.GoldUserDao;
import pro.sunhao.lifeguide.data.gold.GoldPriceData;
import pro.sunhao.lifeguide.pojo.GoldUser;
import pro.sunhao.lifeguide.service.GoldHandlerService;
import pro.sunhao.lifeguide.service.GoldPriceDataService;
import pro.sunhao.lifeguide.service.WeatherDataService;

import java.util.List;

@RestController
@PropertySource(value = "classpath:APIConfig.properties")
public class TestController {

    @Autowired
    private WeatherDataService weatherDataService;

    @Autowired
    private GoldPriceDataService goldPriceDataService;

    @Autowired
    private GoldUserDao goldUserDao;

    @Autowired
    private GoldHandlerService goldHandlerService;

    @RequestMapping(value="/test")
    public String test() {
        //goldPriceDataService.getGoldPriceData();
        //weatherDataService.getWeatherData();
//        List<GoldUser> userList = goldUserDao.selectUserAll();
//        System.out.println(userList);
        goldHandlerService.handle(new GoldPriceData());
        return "Hello World";
    }

}
