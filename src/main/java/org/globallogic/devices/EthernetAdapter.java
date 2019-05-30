package org.globallogic.devices;

import java.util.Objects;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return getSpeed() == that.getSpeed() &&
                Objects.equals(getMac(), that.getMac()) &&
                getManufacturer().equals(that.getSerialNumber()) &&
                getSerialNumber().equals(that.getSerialNumber()) &&
                getPrice() == that.getSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeed(), getMac(), getManufacturer(), getPrice(), getSerialNumber());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", speed=" + speed +
                ", mac='" + mac + '\'' +
                '}';
    }
}
