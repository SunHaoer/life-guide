package pro.sunhao.goldguide.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pro.sunhao.goldguide.data.GoldPriceData;
import pro.sunhao.goldguide.info.TimeInfo;
import pro.sunhao.goldguide.service.GoldPriceDataService;
import pro.sunhao.goldguide.service.HandlerService;

@Component
public class GoldGuideSchedule {

    @Autowired
    private GoldPriceDataService goldPriceDataService;

    @Autowired
    private HandlerService handlerService;

    @Scheduled(cron = TimeInfo.RUN_TIME)
    public void GoldGuideScheduledTask() {
        GoldPriceData goldPriceData = goldPriceDataService.getGoldPriceData();
        if(goldPriceData == null) {
            System.out.println("API 出错");
        } else {
            handlerService.handle(goldPriceData);
        }
    }

}
