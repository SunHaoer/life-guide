package pro.sunhao.lifeguide.data.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDataBase {

    private String weather_code;
    private String time;
    private String area;
    private String wind_direction;
    private String wind_power;
    private String weather;
    private String areaid;
    private String temperature;

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
