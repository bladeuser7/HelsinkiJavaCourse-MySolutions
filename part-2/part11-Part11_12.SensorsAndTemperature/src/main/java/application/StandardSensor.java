package application;

public class StandardSensor implements Sensor {

    private int read;

    public StandardSensor(int read) {
        this.read = read;

    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        return this.read;
    }

}
