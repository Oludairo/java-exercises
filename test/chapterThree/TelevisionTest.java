package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    Television samSung = new Television();
    @Test

    public void televisionCanBeTurnedOnTest(){

        assertEquals(false, samSung.getTurnOn());

        samSung.turnOn(true);
        assertEquals(true, samSung.getTurnOn());

    }
    @Test

    public void televisionCanNextChannelTest(){
        samSung.nextChannel();
        samSung.nextChannel();
        samSung.nextChannel();

        assertEquals(4, samSung.getChannel());
    }

    @Test

    public void televisionCanIncreaseVolumeTest(){
        samSung.volumeUp();
        samSung.volumeUp();

        assertEquals(10, samSung.getVolume());
    }

    @Test

    public void televisionCanDecreaseVolumeTest(){
        samSung.volumeDown();

        assertEquals(7, samSung.getVolume());
    }
}