package ChapterFour;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit");
        int digit = scanner.nextInt();

        int number = 2;
        int value = 0;

        while(number <= digit){


            if(digit % number == 0)
                value = value + number;


            number+=1;

        }
        if (value == digit){
            System.out.println("This is a prime number");
        }
        else {
            System.out.println("This is not a prime number");
        }
    }

}
