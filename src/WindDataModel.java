public class WindDataModel {

    private String time;
    private String wind_speed1;
    private String wind_speed2;
    private String wind_direction1;
    private String wind_direction2;
    private String humidity;
    private String temperature;

    public WindDataModel(String time, String wind_speed1, String wind_speed2, String wind_direction1, String wind_direction2, String humidity, String temperature) {
        this.time = time;
        this.wind_speed1 = wind_speed1;
        this.wind_speed2 = wind_speed2;
        this.wind_direction1 = wind_direction1;
        this.wind_direction2 = wind_direction2;
        this.humidity = humidity;
        this.temperature = temperature;
    }

    public String getTime() { return time; }

    public void setTime(String time) { this.time = time; }

    public String getWind_speed1() { return wind_speed1; }

    public void setWind_speed1(String wind_speed1) { this.wind_speed1 = wind_speed1; }

    public String getWind_speed2() {
        return wind_speed2;
    }

    public void setWind_speed2(String wind_speed2) {
        this.wind_speed2 = wind_speed2;
    }

    public String getWind_direction1() {
        return wind_direction1;
    }

    public void setWind_direction1(String wind_direction1) {
        this.wind_direction1 = wind_direction1;
    }

    public String getWind_direction2() {
        return wind_direction2;
    }

    public void setWind_direction2(String wind_direction2) {
        this.wind_direction2 = wind_direction2;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) { this.temperature = temperature; }

}
