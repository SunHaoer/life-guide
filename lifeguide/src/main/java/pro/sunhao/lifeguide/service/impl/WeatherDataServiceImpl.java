package pro.sunhao.lifeguide.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sunhao.lifeguide.data.weather.WeatherData;
import pro.sunhao.lifeguide.data.weather.WeatherDataBase;
import pro.sunhao.lifeguide.data.weather.WeatherResp;
import pro.sunhao.lifeguide.data.weather.WeatherRespBody;
import pro.sunhao.lifeguide.info.WeatherAPIConfig;
import pro.sunhao.lifeguide.service.WeatherDataService;
import pro.sunhao.lifeguide.util.HttpUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WeatherDataServiceImpl implements WeatherDataService {

    @Autowired
    private WeatherAPIConfig weatherAPIConfig;

    @Override
    public WeatherData getWeatherData() {
        WeatherData weatherData = null;
        String host = weatherAPIConfig.getHost();
        String path = weatherAPIConfig.getPath();
        String method = weatherAPIConfig.getMethod();
        String appcode = weatherAPIConfig.getAppcode();
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("area", "杭州");
        querys.put("areaid", "");

        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            String respStr = EntityUtils.toString(response.getEntity());
//            String respStr = "                {\n" +
//                    "                  \"showapi_res_error\": \"\",\n" +
//                    "                  \"showapi_res_id\": \"75535a9c9c79464f8e0af9dddedd6a82\",\n" +
//                    "                  \"showapi_res_code\": 0,\n" +
//                    "                  \"showapi_res_body\": {\"ret_code\":0,\"area\":\"杭州\",\"areaid\":\"101210101\",\"hourList\":[{\"weather_code\":\"02\",\"time\":\"201905021900\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"areaid\":\"101210101\",\"weather\":\"多云\",\"temperature\":\"21\"},{\"weather_code\":\"02\",\"time\":\"201905022000\",\"area\":\"杭州\",\"wind_direction\":\"无持续风向\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"阴\",\"areaid\":\"101210101\",\"temperature\":\"17\"},{\"weather_code\":\"01\",\"time\":\"201905022100\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"多云\",\"areaid\":\"101210101\",\"temperature\":\"17\"},{\"weather_code\":\"01\",\"time\":\"201905022200\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"多云\",\"areaid\":\"101210101\",\"temperature\":\"17\"},{\"weather_code\":\"00\",\"time\":\"201905022300\",\"area\":\"杭州\",\"wind_direction\":\"无持续风向\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"17\"},{\"weather_code\":\"00\",\"time\":\"201905030000\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"16\"},{\"weather_code\":\"00\",\"time\":\"201905030100\",\"area\":\"杭州\",\"wind_direction\":\"东南风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"15\"},{\"weather_code\":\"00\",\"time\":\"201905030200\",\"area\":\"杭州\",\"wind_direction\":\"无持续风向\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"14\"},{\"weather_code\":\"00\",\"time\":\"201905030300\",\"area\":\"杭州\",\"wind_direction\":\"东南风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"14\"},{\"weather_code\":\"00\",\"time\":\"201905030400\",\"area\":\"杭州\",\"wind_direction\":\"东南风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"13\"},{\"weather_code\":\"00\",\"time\":\"201905030500\",\"area\":\"杭州\",\"wind_direction\":\"无持续风向\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"13\"},{\"weather_code\":\"00\",\"time\":\"201905030600\",\"area\":\"杭州\",\"wind_direction\":\"东南风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"14\"},{\"weather_code\":\"00\",\"time\":\"201905030700\",\"area\":\"杭州\",\"wind_direction\":\"南风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"16\"},{\"weather_code\":\"00\",\"time\":\"201905030800\",\"area\":\"杭州\",\"wind_direction\":\"无持续风向\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"areaid\":\"101210101\",\"weather\":\"晴\",\"temperature\":\"17\"},{\"weather_code\":\"00\",\"time\":\"201905030900\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"19\"},{\"weather_code\":\"00\",\"time\":\"201905031000\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"21\"},{\"weather_code\":\"00\",\"time\":\"201905031100\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"areaid\":\"101210101\",\"weather\":\"晴\",\"temperature\":\"22\"},{\"weather_code\":\"00\",\"time\":\"201905031200\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"0-3级 微风  <5.4m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"23\"},{\"weather_code\":\"00\",\"time\":\"201905031300\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"3-4级 微风  5.5~7.9m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"24\"},{\"weather_code\":\"00\",\"time\":\"201905031400\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"3-4级 微风  5.5~7.9m/s\",\"areaid\":\"101210101\",\"weather\":\"晴\",\"temperature\":\"25\"},{\"weather_code\":\"00\",\"time\":\"201905031500\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"3-4级 微风  5.5~7.9m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"25\"},{\"weather_code\":\"00\",\"time\":\"201905031600\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"3-4级 微风  5.5~7.9m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"25\"},{\"weather_code\":\"00\",\"time\":\"201905031700\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"3-4级 微风  5.5~7.9m/s\",\"areaid\":\"101210101\",\"weather\":\"晴\",\"temperature\":\"24\"},{\"weather_code\":\"00\",\"time\":\"201905031800\",\"area\":\"杭州\",\"wind_direction\":\"东风\",\"wind_power\":\"3-4级 微风  5.5~7.9m/s\",\"weather\":\"晴\",\"areaid\":\"101210101\",\"temperature\":\"23\"}]}\n" +
//                    "                }";
            System.out.println(respStr);
            WeatherResp resp = JSONObject.parseObject(respStr, WeatherResp.class);
            WeatherRespBody respBody = resp.getShowapi_res_body();
            List<WeatherDataBase> weatherHourList = respBody.getHourList();
            weatherData = analyzeWeather(weatherHourList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(weatherData);
        return weatherData;
    }

    private WeatherData analyzeWeather(List<WeatherDataBase> weatherHourList) {
        WeatherData weatherData = new WeatherData();
        for(WeatherDataBase data : weatherHourList) {
            int weatherCode = Integer.parseInt(data.getWeather_code());
            if(weatherCode > 2 && weatherCode != 18) {    // wetherCode 0, 1, 2, 18不下雨
                weatherData.setFine(false);
            }
            weatherData.setLowTemperature(Math.min(weatherData.getLowTemperature(), Integer.parseInt(data.getTemperature())));
            weatherData.setHighTemperature(Math.max(weatherData.getHighTemperature(), Integer.parseInt(data.getTemperature())));
        }
        return weatherData;
    }

}




/*
    Map<String, String> weatherTable = new HashMap<String, String>() {
        {
            weatherTable.put("00", "晴");
            weatherTable.put("01", "多云");
            weatherTable.put("02", "阴");
            weatherTable.put("03", "阵雨");
            weatherTable.put("04", "雷阵雨");
            weatherTable.put("05", "雷阵雨伴有冰雹");
            weatherTable.put("06", "雨夹雪");
            weatherTable.put("07", "小雨");
            weatherTable.put("08", "中雨");
            weatherTable.put("09", "大雨");
            weatherTable.put("10", "暴雨");
            weatherTable.put("11", "大暴雨");
            weatherTable.put("12", "特大暴雨");
            weatherTable.put("13", "阵雪");
            weatherTable.put("14", "小雪");
            weatherTable.put("15", "中雪");
            weatherTable.put("16", "大雪");
            weatherTable.put("17", "暴雪");
            weatherTable.put("18", "雾");
            weatherTable.put("19", "冻雨");
            weatherTable.put("20", "沙尘暴");
            weatherTable.put("21", "小到中雨");
            weatherTable.put("22", "中到大雨");
            weatherTable.put("23", "大到暴雨");
            weatherTable.put("24", "暴雨到大暴雨");
            weatherTable.put("25", "大暴雨到特大暴雨");
            weatherTable.put("26", "小到中雪");
            weatherTable.put("27", "中到大雪");
            weatherTable.put("28", "大到暴雪");
            weatherTable.put("29", "浮尘");
            weatherTable.put("30", "扬沙");
            weatherTable.put("31", "强沙尘暴");
            weatherTable.put("53", "霾");
            weatherTable.put("99", "无");
            weatherTable.put("301", "雨");
            weatherTable.put("302", "雪");
        }
    };
*/
