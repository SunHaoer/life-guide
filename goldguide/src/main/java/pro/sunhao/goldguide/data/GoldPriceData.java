package pro.sunhao.goldguide.data;

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

    public GoldPriceData() {
    }

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

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public Double getLatestpri() {
        return latestpri;
    }

    public void setLatestpri(Double latestpri) {
        this.latestpri = latestpri;
    }

    public Double getOpenpri() {
        return openpri;
    }

    public void setOpenpri(Double openpri) {
        this.openpri = openpri;
    }

    public Double getMaxpri() {
        return maxpri;
    }

    public void setMaxpri(Double maxpri) {
        this.maxpri = maxpri;
    }

    public Double getMinpri() {
        return minpri;
    }

    public void setMinpri(Double minpri) {
        this.minpri = minpri;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public Double getYespri() {
        return yespri;
    }

    public void setYespri(Double yespri) {
        this.yespri = yespri;
    }

    public Double getTotalvol() {
        return totalvol;
    }

    public void setTotalvol(Double totalvol) {
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
