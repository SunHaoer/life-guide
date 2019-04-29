package pro.sunhao.goldguide.pojo;

public class User {

    private Long userId;
    private String userEmail;
    private Double userPrice;

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

    public Double getUserPrice() {
        return userPrice;
    }

    public void setUserPrice(Double userPrice) {
        this.userPrice = userPrice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"userId\":")
                .append(userId);
        sb.append(",\"userEmail\":\"")
                .append(userEmail).append('\"');
        sb.append(",\"userPrice\":")
                .append(userPrice);
        sb.append('}');
        return sb.toString();
    }

}
