package chapterFour;

public class kata {
    public int calculateFactorialOf(int i) {
        int counter = 1;
        int factorial = 1;

        while(counter!=0){

            factorial = counter * factorial;

        }



        return 0;
    }

    public int calculate1To4Copies(int copies) {
        int price = 0;
        if (copies >= 200) {
            price = copies * 800;
        } else
             if (copies >= 100 && copies <= 199) {
                 price = copies * 900;

                }else
                    if (copies >= 50 && copies <= 99) {
                        price = copies * 1000;

                    }else
                        if (copies >= 30 && copies <= 49) {
                            price = copies * 1100;

                        }else
                            if (copies >= 10 && copies <= 29) {
                                price = copies * 1200;

                            }else
                                if (copies >= 5 && copies <= 9) {
                                    price = copies * 1400;

                                }else
                                    if (copies >= 1 && copies <= 4) {
                                        price = copies * 1500;

                                }
                return price;

    }
}