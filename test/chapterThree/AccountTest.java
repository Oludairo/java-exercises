    package chapterThree;

    import org.junit.jupiter.api.Test;

    import java.util.Scanner;

    import static org.junit.jupiter.api.Assertions.*;

    public class AccountTest {

        @Test
        public void accountCanDepositTest(){
            //given
            Account emmanuelAccount = new Account();

            //when
            emmanuelAccount.deposit(150);

            //check
            int emmanuelBalance = emmanuelAccount.getBalance();
            assertEquals(150, emmanuelBalance);

        }

        @Test
        public void accountCanDepositMoreThanOneAmountTest(){
            //given
            Account emmanuelAccount = new Account();

            //when
            emmanuelAccount.deposit(150);
            emmanuelAccount.deposit(80);

            //check
            int emmanuelBalance = emmanuelAccount.getBalance();
            assertEquals(230, emmanuelBalance);

        }

            @Test

            public void accountCannotTakeNegativeDeposit(){
            //Given
            Account emmanuelAccount = new Account();

            //When
            emmanuelAccount.deposit(150);
            emmanuelAccount.deposit(-80);

            //Check
            int emmanuelBalance = emmanuelAccount.getBalance();
            assertEquals(150, emmanuelBalance);

            }

            @Test

            public void accountCanWithdraw(){
            //Given
            Account tifeAccount = new Account();

            //When
            tifeAccount.deposit(30_000);
            tifeAccount.withdraw(20_000, 1234);

            //Check
            int accountBalance = tifeAccount.getBalance();
            assertEquals(10_000, accountBalance);



            }


        @Test

        public void accountCannotWithdrawMoreThanBalance(){
            //Given
            Account toyeAccount = new Account();

            //When
            toyeAccount.deposit(20_000);
            toyeAccount.withdraw(22_000, 1234);

            //Check
            int accountBalance = toyeAccount.getBalance();
            assertEquals(20_000, accountBalance);



        }
        @Test
        public void accountCannotWithdrawWithWrongPin(){
            //Given
            Account toyeAccount = new Account();

            //When
            toyeAccount.deposit(20_000);
            toyeAccount.withdraw(15_000, 2345);

            //Check
            int accountBalance = toyeAccount.getBalance();
            assertEquals(20_000, accountBalance);



        }

        @Test
        public void accountCanSetName(){
            Scanner scanner = new Scanner(System.in);
            Account myAccount = new Account();
            System.out.println("Enter the name: ");
            String myName = scanner.nextLine();
            myAccount.setName(myName);
            System.out.println();
            //myName = myAccount.getName();
            System.out.printf("My name is : %n%s%n", myAccount.getName());


        }









        //@Test
            //public void accountCannotWithdrawWithoutAUniquePinTest(){
                //Account emmanuelAccount = new Account();
                //emmanuelAccount.deposit(accountCanDeposit:10_000);
                //when
                //emmanuelAccount.withdraw(ammont.d)

                //assert

                //assertEquals(10_000, emmanuelAccount.getBalance())





        }

    //}