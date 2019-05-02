package pro.sunhao.lifeguide.data.weather;

public class WeatherDataBase {

    private String weather_code;
    private String time;
    private String area;
    private String wind_direction;
    private String wind_power;
    private String weather;
    private String areaid;
    private String temperature;

    public String getWeather_code() {
        return weather_code;
    }

    public void setWeather_code(String weather_code) {
        this.weather_code = weather_code;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWind_power() {
        return wind_power;
    }

    public void setWind_power(String wind_power) {
        this.wind_power = wind_power;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"weather_code\":\"")
                .append(weather_code).append('\"');
        sb.append(",\"time\":\"")
                .append(time).append('\"');
        sb.append(",\"area\":\"")
                .append(area).append('\"');
        sb.append(",\"wind_direction\":\"")
                .append(wind_direction).append('\"');
        sb.append(",\"wind_power\":\"")
                .append(wind_power).append('\"');
        sb.append(",\"weather\":\"")
                .append(weather).append('\"');
        sb.append(",\"areaid\":\"")
                .append(areaid).append('\"');
        sb.append(",\"temperature\":\"")
                .append(temperature).append('\"');
        sb.append('}');
        return sb.toString();
    }

}
