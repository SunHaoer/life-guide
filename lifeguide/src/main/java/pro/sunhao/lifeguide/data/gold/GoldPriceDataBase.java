package pro.sunhao.lifeguide.data.gold;

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

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getLatestpri() {
        return latestpri;
    }

    public void setLatestpri(String latestpri) {
        this.latestpri = latestpri;
    }

    public String getOpenpri() {
        return openpri;
    }

    public void setOpenpri(String openpri) {
        this.openpri = openpri;
    }

    public String getMaxpri() {
        return maxpri;
    }

    public void setMaxpri(String maxpri) {
        this.maxpri = maxpri;
    }

    public String getMinpri() {
        return minpri;
    }

    public void setMinpri(String minpri) {
        this.minpri = minpri;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getYespri() {
        return yespri;
    }

    public void setYespri(String yespri) {
        this.yespri = yespri;
    }

    public String getTotalvol() {
        return totalvol;
    }

    public void setTotalvol(String totalvol) {
        this.totalvol = totalvol;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

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
