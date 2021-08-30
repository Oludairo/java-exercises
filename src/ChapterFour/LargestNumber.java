package ChapterFour;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        int firstLargest = 0;
        int secondLargest = 0;
        int counter = 1;

        while (counter <= 10) {

            System.out.println("Enter number " + counter);
            int number = userInput.nextInt();

            counter++;


            if (number > firstLargest) {
                firstLargest = number;
                System.out.printf("first largest number is %d%n", firstLargest);


                if (firstLargest < number && number > secondLargest) {
                    secondLargest = number;
                    System.out.printf("second largest number is %d%n", secondLargest);

                }

            }
        }
    }


}