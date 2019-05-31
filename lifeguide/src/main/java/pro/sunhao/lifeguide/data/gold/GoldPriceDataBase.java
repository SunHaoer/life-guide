package pro.sunhao.lifeguide.data.gold;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoldPriceDataBase {

    private String variety;    // 种类
    private String latestpri;   // 最新价格
    private String openpri;    // 当日开盘价格
    private String maxpri;    // 当日最高价格
    private String minpri;    // 当日最低价格
    private String limit;   // 涨跌幅
    private String yespri;    // 昨收价
    private String totalvol;    // 总成交量
    private String time;    // 更新时间

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"variety\":\"")
                .append(variety).append('\"');
        sb.append(",\"latestpri\":\"")
                .append(latestpri).append('\"');
        sb.append(",\"openpri\":\"")
                .append(openpri).append('\"');
        sb.append(",\"maxpri\":\"")
                .append(maxpri).append('\"');
        sb.append(",\"minpri\":\"")
                .append(minpri).append('\"');
        sb.append(",\"limit\":\"")
                .append(limit).append('\"');
        sb.append(",\"yespri\":\"")
                .append(yespri).append('\"');
        sb.append(",\"totalvol\":\"")
                .append(totalvol).append('\"');
        sb.append(",\"time\":\"")
                .append(time).append('\"');
        sb.append('}');
        return sb.toString();
    }

}
