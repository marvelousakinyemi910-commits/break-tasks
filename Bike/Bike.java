public class Bike {
    private boolean isOn;
    private int speed;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getSpeed() {
        return speed;
    }
    public int getGear() {
        if (speed <= 20) return 1;
        if (speed <= 30) return 2;
        if (speed <= 40) return 3;
        return 4;
    }

    public void accelerate() {
        if (!isOn) return;

        if (getGear() == 1) speed += 1;
        else if (getGear() == 2) speed += 2;
        else if (getGear() == 3) speed += 3;
        else speed += 4;
    }
}
