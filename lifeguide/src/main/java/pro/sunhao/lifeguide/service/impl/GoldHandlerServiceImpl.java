package pro.sunhao.lifeguide.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import pro.sunhao.lifeguide.dao.GoldUserDao;
import pro.sunhao.lifeguide.data.gold.GoldPriceData;
import pro.sunhao.lifeguide.pojo.GoldUser;
import pro.sunhao.lifeguide.service.GoldHandlerService;
import pro.sunhao.lifeguide.util.MessageFactory;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoldHandlerServiceImpl implements GoldHandlerService {

    @Autowired
    private GoldUserDao userDao;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void handle(GoldPriceData goldPriceData) {
        List<GoldUser> userList = userDao.selectUserAll();
        for(GoldUser user : userList) {
            if(goldPriceData.getLatestpri() <= user.getUserLowPrice()) {    // 提醒买入
                List<String> paramList = new ArrayList<String>() {
                    {
                        this.add(goldPriceData.getLatestpri().toString());
                        this.add(user.getUserLowPrice().toString());
                    }
                };
                sendEmail(user.getUserEmail(), paramList, 1);
            }
            if(goldPriceData.getLatestpri() >= user.getUserHighPrice()) {    // 提醒卖出
                List<String> paramList = new ArrayList<String>() {
                    {
                        this.add(goldPriceData.getLatestpri().toString());
                        this.add(user.getUserHighPrice().toString());
                    }
                };
                sendEmail(user.getUserEmail(), paramList, 2);
            }
        }
    }

    private void sendEmail(String sendToAddress, List<String> paramList, int num) {
        SimpleMailMessage message = MessageFactory.getMessage(num, sendToAddress, paramList);
        mailSender.send(message);
    }

}
