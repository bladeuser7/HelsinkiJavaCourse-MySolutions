package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean isOn;

    public TemperatureSensor() {
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        int random30;
        if (isOn()) {
            random30 = new Random().nextInt(30) - new Random().nextInt(30);
            
            return random30;
        }
        throw new IllegalStateException("error");
    }

}
