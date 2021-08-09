package web.model;

public class Car {
    private long id;
    private String model;
    private int motorPower;

    public Car() {}

    public Car(long id, String model, int motorPower) {
        this.id = id;
        this.model = model;
        this.motorPower = motorPower;
    }

    public long getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotorPower() {
        return motorPower;
    }

    public void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
    }
}
