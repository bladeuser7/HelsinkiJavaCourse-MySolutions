package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sex;
    private List<Integer> reading;

    public AverageSensor() {
        this.sex = new ArrayList();
        this.reading = new ArrayList();

    }

    public void addSensor(Sensor toAdd) {
        this.sex.add(toAdd);
    }

    @Override
    public boolean isOn() {
        int counter = 0;
        for (Sensor sense : sex) {
            if (sense.isOn()) {
                counter++;
            }
        }
        if (counter >= sex.size()) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        for (Sensor sense : sex) {
            sense.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sense : sex) {
            if (sense.isOn()) {
                sense.setOff();
            }
        }
    }

    public List<Integer> readings() {

        return reading;
    }

    @Override
    public int read() {
        if (sex.isEmpty()) {
            throw new IllegalStateException("error");
        }
        int read = 0;
        for (Sensor sense : sex) {
            read = sense.read() + read;
        }
          int reading = read / sex.size();
          this.reading.add(reading);
          
        return reading;
    }
}
