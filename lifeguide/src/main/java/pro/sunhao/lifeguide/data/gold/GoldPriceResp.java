package pro.sunhao.lifeguide.data.gold;

import pro.sunhao.lifeguide.data.gold.GoldPriceDataBase;

import java.util.List;

public class GoldPriceResp {

    private String error_code;
    private String reason;
    private List<GoldPriceDataBase> result;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<GoldPriceDataBase> getResult() {
        return result;
    }

    public void setResult(List<GoldPriceDataBase> result) {
        this.result = result;
    }

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
