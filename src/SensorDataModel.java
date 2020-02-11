public class SensorDataModel {

    private String heading;
    private String height;
    private String type;
    private String model;
    private String number;

    public SensorDataModel(String heading, String height, String type, String model, String number) {
        this.heading = heading;
        this.height = height;
        this.type = type;
        this.model = model;
        this.number = number;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
