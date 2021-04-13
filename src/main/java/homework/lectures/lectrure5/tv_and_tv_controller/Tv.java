package homework.lectures.lectrure5.tv_and_tv_controller;

import org.apache.log4j.Logger;

import java.util.Objects;

public class Tv {
    private static final Logger logger = Logger.getLogger(Tv.class);

    private Integer currentChanel;
    private Integer currentVolume;
    private String manufacturer;
    private boolean isOn;

    public Tv(Integer currentChanel, Integer currentVolume, String manufacturer, boolean isOn) {
        this.currentChanel = currentChanel;
        this.currentVolume = currentVolume;
        this.manufacturer = manufacturer;
        this.isOn = isOn;
    }

    public void switchChanelUp() {
        if (isOn) {
            currentChanel += 1;
        } else
            logger.info("Please, turn on the TV " + manufacturer);
    }

    public void switchChanelDown() {
        if (isOn) {
            currentChanel -= 1;
        } else
            logger.info("Please, turn on the TV " + manufacturer);
    }

    public void switchVolumeUp() {
        if (isOn) {
            currentVolume += 1;
        } else
            logger.info("Please, turn on the TV " + manufacturer);
    }

    public void switchVolumeDown() {
        if (isOn) {
            currentVolume -= 1;
        } else
            logger.info("Please, turn on the TV " + manufacturer);
    }

    public boolean turnOnTV() {
        return isOn;
    }

    public boolean turnOffTV() {
        return isOn = false;
    }

    public Integer getCurrentChanel() {
        return currentChanel;
    }

    public Integer getCurrentVolume() {
        return currentVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return isOn == tv.isOn &&
                Objects.equals(currentChanel, tv.currentChanel) &&
                Objects.equals(currentVolume, tv.currentVolume) &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChanel, currentVolume, manufacturer, isOn);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChanel=" + currentChanel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", isOn=" + isOn +
                '}';
    }
}
