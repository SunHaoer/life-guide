package pro.sunhao.goldguide.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;
import pro.sunhao.goldguide.data.GoldPriceData;
import pro.sunhao.goldguide.data.GoldPriceDataBase;
import pro.sunhao.goldguide.data.GoldPriceResp;
import pro.sunhao.goldguide.info.GoldPriceAPIConfig;
import pro.sunhao.goldguide.service.GoldPriceDataService;
import pro.sunhao.goldguide.util.HttpUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class GoldPriceDataServiceImpl implements GoldPriceDataService {

    @Override
    public GoldPriceData getGoldPriceData() {
        GoldPriceData goldPriceData = null;
        //GoldPriceDataBase goldPriceDataBase = new GoldPriceDataBase();
        String host = GoldPriceAPIConfig.HOST;
        String path = GoldPriceAPIConfig.PATH;
        String method = GoldPriceAPIConfig.METHOD;
        String appcode = GoldPriceAPIConfig.APPCODE;
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        Map<String, String> bodys = new HashMap<String, String>();

        try {
            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            //System.out.println(response.toString());
            //获取response的body
            String respStr = EntityUtils.toString(response.getEntity());
            //{"error_code":0,"reason":"成功","result":[{"variety":"Au99.95","latestpri":"280.6","openpri":"281.25","maxpri":"281.4","minpri":"280.6","limit":"--","yespri":"280.6","totalvol":"20.00","time":"2019/4/29 14:58:38"},{"variety":"iAu99.99","latestpri":"277.8","openpri":"276","maxpri":"278.7","minpri":"276","limit":"--","yespri":"277.98","totalvol":"334.28","time":"2019/4/29 14:58:38"},{"variety":"iAu100g","latestpri":"245","openpri":"0","maxpri":"0","minpri":"0","limit":"--","yespri":"280","totalvol":"0.00","time":"2019/4/29 14:58:38"},{"variety":"Au100g","latestpri":"279","openpri":"281","maxpri":"282.38","minpri":"279","limit":"--","yespri":"281.41","totalvol":"2.00","time":"2019/4/29 14:58:38"},{"variety":"Au99.99","latestpri":"280.5","openpri":"281.98","maxpri":"281.98","minpri":"279.99","limit":"--","yespri":"281","totalvol":"2324.56","time":"2019/4/29 14:58:38"},{"variety":"PGC30g","latestpri":"284","openpri":"0","maxpri":"0","minpri":"0","limit":"--","yespri":"283.33","totalvol":"---","time":"2019/4/29 14:58:38"}]}

            GoldPriceResp resp = JSONObject.parseObject(respStr, GoldPriceResp.class);
            GoldPriceDataBase goldPriceDataBase = resp.getResult().get(1);
            goldPriceData = new GoldPriceData(goldPriceDataBase);
            //System.out.println(goldPriceDataBase);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return goldPriceData;
    }

}
