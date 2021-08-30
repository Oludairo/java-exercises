package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MP3_PlayerTest {
    MP3_Player sony = new MP3_Player();
    
    @Test

    public void MP3_PlayerCanBeTurnedOnTest(){

        assertEquals(false, sony.getTurnOn());

        sony.turnOn(true);
        assertEquals(true, sony.getTurnOn());

    }



}

