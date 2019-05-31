package pro.sunhao.lifeguide.data.weather;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherResp {

    private String showapi_res_error;
    private String showapi_res_id;
    private String showapi_res_code;
    private WeatherRespBody showapi_res_body;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"showapi_res_error\":\"")
                .append(showapi_res_error).append('\"');
        sb.append(",\"showapi_res_id\":\"")
                .append(showapi_res_id).append('\"');
        sb.append(",\"showapi_res_code\":\"")
                .append(showapi_res_code).append('\"');
        sb.append(",\"showapi_res_body\":")
                .append(showapi_res_body);
        sb.append('}');
        return sb.toString();
    }

}
