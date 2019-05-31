package pro.sunhao.lifeguide.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pro.sunhao.lifeguide.data.gold.GoldPriceData;
import pro.sunhao.lifeguide.info.TimeInfo;
import pro.sunhao.lifeguide.service.GoldPriceDataService;
import pro.sunhao.lifeguide.service.GoldHandlerService;

@Component
public class GoldGuideSchedule {

    @Autowired
    private GoldPriceDataService goldPriceDataService;

    @Autowired
    private GoldHandlerService goldHandlerService;

    @Scheduled(cron = TimeInfo.TEST_TIME)
    public void GoldGuideScheduledTask() {
        GoldPriceData goldPriceData = goldPriceDataService.getGoldPriceData();
        if(goldPriceData == null) {
            System.out.println("API error");
        } else {
            goldHandlerService.handle(goldPriceData);
        }
    }

}
