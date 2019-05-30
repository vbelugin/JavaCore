package org.globallogic.devices;

import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return getManufacturer().equals(monitor.getManufacturer()) &&
                getResolutionX() == monitor.getResolutionX() &&
                getResolutionY() == monitor.getResolutionY() &&
                getSerialNumber().equals(monitor.getSerialNumber()) &&
                getPrice() == monitor.getPrice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getResolutionX(), getResolutionY(), getManufacturer(), getPrice(), getSerialNumber());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", resolutionX='" + resolutionX + '\'' +
                ", resolutionY='" + resolutionY + '\'';
    }
}
