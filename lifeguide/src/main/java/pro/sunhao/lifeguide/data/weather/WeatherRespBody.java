package pro.sunhao.lifeguide.data.weather;

import java.util.List;

public class WeatherRespBody {

    private String ret_code;
    private String area;
    private String areaid;
    private List<WeatherDataBase> hourList;

    public String getRet_code() {
        return ret_code;
    }

    public void setRet_code(String ret_code) {
        this.ret_code = ret_code;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public List<WeatherDataBase> getHourList() {
        return hourList;
    }

    public void setHourList(List<WeatherDataBase> hourList) {
        this.hourList = hourList;
    }

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
