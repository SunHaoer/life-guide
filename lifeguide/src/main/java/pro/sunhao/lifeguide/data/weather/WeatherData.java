package pro.sunhao.lifeguide.data.weather;

public class WeatherData {

    private boolean fine;
    private int lowTemperature;
    private int highTemperature;

    public WeatherData() {
        this.fine = true;
        this.lowTemperature = 100;
        this.highTemperature = -100;
    }

    public boolean isFine() {
        return fine;
    }

    public void setFine(boolean fine) {
        this.fine = fine;
    }

    public int getLowTemperature() {
        return lowTemperature;
    }

    public void setLowTemperature(int lowTemperature) {
        this.lowTemperature = lowTemperature;
    }

    public int getHighTemperature() {
        return highTemperature;
    }

    public void setHighTemperature(int highTemperature) {
        this.highTemperature = highTemperature;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"fine\":")
                .append(fine);
        sb.append(",\"lowTemperature\":")
                .append(lowTemperature);
        sb.append(",\"highTemperature\":")
                .append(highTemperature);
        sb.append('}');
        return sb.toString();
    }

}
