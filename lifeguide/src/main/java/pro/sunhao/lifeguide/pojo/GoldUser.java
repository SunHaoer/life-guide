package pro.sunhao.lifeguide.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoldUser {

    private Long userId;
    private String userEmail;
    private Double userLowPrice;
    private Double userHighPrice;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"userId\":")
                .append(userId);
        sb.append(",\"userEmail\":\"")
                .append(userEmail).append('\"');
        sb.append(",\"userLowPrice\":")
                .append(userLowPrice);
        sb.append(",\"userHighPrice\":")
                .append(userHighPrice);
        sb.append('}');
        return sb.toString();
    }

}
