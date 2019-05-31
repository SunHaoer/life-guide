package pro.sunhao.lifeguide.data.gold;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoldPriceData {

    private String variety;    // 种类
    private Double latestpri;   // 最新价格
    private Double openpri;    // 当日开盘价格
    private Double maxpri;    // 当日最高价格
    private Double minpri;    // 当日最低价格
    private String limit;   // 涨跌幅
    private Double yespri;    // 昨收价
    private Double totalvol;    // 总成交量
    private String time;    // 更新时间

    public GoldPriceData(GoldPriceDataBase goldPriceDataBase) {
        this.variety = goldPriceDataBase.getVariety();
        this.latestpri = Double.parseDouble(goldPriceDataBase.getLatestpri());
        this.openpri = Double.parseDouble(goldPriceDataBase.getOpenpri());
        this.maxpri = Double.parseDouble(goldPriceDataBase.getMaxpri());
        this.minpri = Double.parseDouble(goldPriceDataBase.getMinpri());
        this.limit = goldPriceDataBase.getLimit();
        this.yespri = Double.parseDouble(goldPriceDataBase.getYespri());
        this.totalvol = Double.parseDouble(goldPriceDataBase.getTotalvol());
        this.time = goldPriceDataBase.getTime();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"variety\":\"")
                .append(variety).append('\"');
        sb.append(",\"latestpri\":")
                .append(latestpri);
        sb.append(",\"openpri\":")
                .append(openpri);
        sb.append(",\"maxpri\":")
                .append(maxpri);
        sb.append(",\"minpri\":")
                .append(minpri);
        sb.append(",\"limit\":\"")
                .append(limit).append('\"');
        sb.append(",\"yespri\":")
                .append(yespri);
        sb.append(",\"totalvol\":")
                .append(totalvol);
        sb.append(",\"time\":\"")
                .append(time).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
