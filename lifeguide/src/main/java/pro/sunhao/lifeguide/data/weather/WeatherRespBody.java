package pro.sunhao.lifeguide.data.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherRespBody {

    private String ret_code;
    private String area;
    private String areaid;
    private List<WeatherDataBase> hourList;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"ret_code\":\"")
                .append(ret_code).append('\"');
        sb.append(",\"area\":\"")
                .append(area).append('\"');
        sb.append(",\"areaid\":\"")
                .append(areaid).append('\"');
        sb.append(",\"hourList\":")
                .append(hourList);
        sb.append('}');
        return sb.toString();
    }

}
