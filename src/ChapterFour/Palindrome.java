package ChapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int number;
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int forthNumber;
        int fifthNumber;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a five digit number");
         number = userInput.nextInt();

         while(!(number >=10000 && number <=99999 )){
             System.out.println(" Error:Enter a five digit number");
             number = userInput.nextInt();
         }

        firstNumber = number % 10;
        number = number/10;

        secondNumber = number % 10;
        number = number/ 10;

        thirdNumber = number % 10;
        number = number / 10;

        forthNumber = number % 10;
        number = number / 10;

        fifthNumber = number;

        if(firstNumber == fifthNumber && secondNumber == forthNumber) {
            System.out.println("this is a palindrome");
        }else{
            System.out.println("this is not a palindrome");
        }
        number = userInput.nextInt();





    }
}
