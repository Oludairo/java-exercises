package chapterThree;

public class Television {
    private boolean isOn;
    private int channel = 1;
    private int volume = 8;


    public void turnOn(boolean isOn) {
        this.isOn=isOn;
    }

    public boolean getTurnOn() {
        return isOn;
    }

    public void nextChannel() {
        channel = channel+1;
    }

    public int getChannel() {
        return channel;
    }

    public void volumeUp() {
        volume = volume +1;
    }

    public int getVolume() {
        return volume;
    }

    public void volumeDown() {
        volume = volume -1;
    }
}
