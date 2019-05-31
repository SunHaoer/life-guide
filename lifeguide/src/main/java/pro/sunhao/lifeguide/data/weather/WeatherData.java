package pro.sunhao.lifeguide.data.weather;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherData {

    private boolean fine;
    private int lowTemperature;
    private int highTemperature;

    public WeatherData() {
        this.fine = true;
        this.lowTemperature = 100;
        this.highTemperature = -100;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"fine\":")
                .append(fine);
        sb.append(",\"lowTemperature\":")
                .append(lowTemperature);
        sb.append(",\"highTemperature\":")
                .append(highTemperature);
        sb.append('}');
        return sb.toString();
    }

}
