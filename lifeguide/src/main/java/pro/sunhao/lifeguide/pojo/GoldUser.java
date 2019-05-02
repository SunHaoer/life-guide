package pro.sunhao.lifeguide.pojo;

public class GoldUser {

    private Long userId;
    private String userEmail;
    private Double userLowPrice;
    private Double userHighPrice;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Double getUserLowPrice() {
        return userLowPrice;
    }

    public void setUserLowPrice(Double userLowPrice) {
        this.userLowPrice = userLowPrice;
    }

    public Double getUserHighPrice() {
        return userHighPrice;
    }

    public void setUserHighPrice(Double userHighPrice) {
        this.userHighPrice = userHighPrice;
    }

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
