package pro.sunhao.goldguide.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import pro.sunhao.goldguide.dao.UserDao;
import pro.sunhao.goldguide.data.GoldPriceData;
import pro.sunhao.goldguide.pojo.User;
import pro.sunhao.goldguide.service.HandlerService;
import pro.sunhao.goldguide.util.MessageFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class HandlerServiceImpl implements HandlerService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void handle(GoldPriceData goldPriceData) {
        //System.out.println(goldPriceData);
        List<User> userList = userDao.selectUserAll();
        for(User user : userList) {
            System.out.println(user.getUserPrice() + " " + goldPriceData.getLatestpri());
            if(goldPriceData.getLatestpri() <= user.getUserPrice()) {
                List<String> paramList = new ArrayList<String>() {
                    {
                        this.add(goldPriceData.getTime());
                        this.add(goldPriceData.getLatestpri().toString());
                        this.add(user.getUserPrice().toString());
                    }
                };
                sendEmail(user.getUserEmail(), paramList);
            }
        }
    }

    private void sendEmail(String sendToAddress, List<String> paramList) {
        SimpleMailMessage message = MessageFactory.getMessage(0, sendToAddress, paramList);
        mailSender.send(message);
    }


}
