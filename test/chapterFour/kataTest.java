package chapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class kataTest {

  //  @Test
   //         void calculateFactorialTest(){

     //   kata kata = new kata();

     //   int result = kata.calculateFactorialOf(3);

    //    assertEquals(6, result);

    //}


    @Test
            void calculateTheAmountOf200AndAboveCopiesTest(){

        kata kata = new kata();
//        int price = kata.calculate1To4Copies(200);
        assertEquals(160000, kata.calculate1To4Copies(200));
        assertEquals(200000, kata.calculate1To4Copies(250));
        assertEquals(280000, kata.calculate1To4Copies(350));
    }

    @Test
            void calculateTheAmountOf100To199CopiesTest(){
        kata kata = new kata();
                assertEquals(179100, kata.calculate1To4Copies(199));
                assertEquals(135000, kata.calculate1To4Copies(150));
                assertEquals(90000, kata.calculate1To4Copies(100));

            }

    @Test
    void calculateTheAmountOf50To99CopiesTest(){

        kata kata = new kata();
        assertEquals(99000, kata.calculate1To4Copies(99));
        assertEquals(50000, kata.calculate1To4Copies(50));
        assertEquals(70000, kata.calculate1To4Copies(70));
    }

    @Test
    void calculateTheAmountOf30To49CopiesTest(){

        kata kata = new kata();
        assertEquals(53900, kata.calculate1To4Copies(49));
        assertEquals(33000, kata.calculate1To4Copies(30));
        assertEquals(44000, kata.calculate1To4Copies(40));
    }

    @Test
    void calculateTheAmountOf10To29CopiesTest(){

        kata kata = new kata();
        assertEquals(34800, kata.calculate1To4Copies(29));
        assertEquals(12000, kata.calculate1To4Copies(10));
        assertEquals(24000, kata.calculate1To4Copies(20));
    }

    @Test
    void calculateTheAmountOf5To9CopiesTest(){

        kata kata = new kata();
        assertEquals(12600, kata.calculate1To4Copies(9));
        assertEquals(9800, kata.calculate1To4Copies(7));
        assertEquals(7000, kata.calculate1To4Copies(5));
    }

    @Test
    void calculateTheAmountOf1To4CopiesTest(){

        kata kata = new kata();
        assertEquals(6000, kata.calculate1To4Copies(4));
        assertEquals(3000, kata.calculate1To4Copies(2));
        assertEquals(1500, kata.calculate1To4Copies(1));
    }

}
