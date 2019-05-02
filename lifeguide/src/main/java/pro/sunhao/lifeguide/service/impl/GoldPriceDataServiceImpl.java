package pro.sunhao.lifeguide.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sunhao.lifeguide.data.gold.GoldPriceData;
import pro.sunhao.lifeguide.data.gold.GoldPriceDataBase;
import pro.sunhao.lifeguide.data.gold.GoldPriceResp;
import pro.sunhao.lifeguide.info.GoldPriceAPIConfig;
import pro.sunhao.lifeguide.service.GoldPriceDataService;
import pro.sunhao.lifeguide.util.HttpUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class GoldPriceDataServiceImpl implements GoldPriceDataService {

    @Autowired
    private GoldPriceAPIConfig goldPriceAPIConfig;

    @Override
    public GoldPriceData getGoldPriceData() {
        GoldPriceData goldPriceData = null;
        String host = goldPriceAPIConfig.getHost();
        String path = goldPriceAPIConfig.getPath();
        String method = goldPriceAPIConfig.getMethod();
        String appcode = goldPriceAPIConfig.getAppcode();
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();
        System.out.println(goldPriceAPIConfig);
        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            //System.out.println(response.toString());
            //获取response的body
            String respStr = EntityUtils.toString(response.getEntity());

            GoldPriceResp resp = JSONObject.parseObject(respStr, GoldPriceResp.class);
            GoldPriceDataBase goldPriceDataBase = resp.getResult().get(1);
            goldPriceData = new GoldPriceData(goldPriceDataBase);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return goldPriceData;
    }

}
