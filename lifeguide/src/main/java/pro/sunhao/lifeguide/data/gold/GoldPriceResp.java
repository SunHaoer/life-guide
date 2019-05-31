package pro.sunhao.lifeguide.data.gold;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pro.sunhao.lifeguide.data.gold.GoldPriceDataBase;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoldPriceResp {

    private String error_code;
    private String reason;
    private List<GoldPriceDataBase> result;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"error_code\":\"")
                .append(error_code).append('\"');
        sb.append(",\"reason\":\"")
                .append(reason).append('\"');
        sb.append(",\"result\":")
                .append(result);
        sb.append('}');
        return sb.toString();
    }
}
