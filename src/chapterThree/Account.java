    package chapterThree;

    public class Account {
        private int balance;
        private String name;


        public void deposit(int amountToDeposit) {
            //balance = balance+amountToDeposit;
            if(amountToDeposit > 0){
                balance= balance+amountToDeposit;
            }
        }
        public void withdraw(int amountToWithdraw, int pin) {
            //balance= balance-amountToWithdraw;
            if (amountToWithdraw <= balance && pin ==1234) {
                balance = balance - amountToWithdraw;
            }

        }

        public int getBalance() {
            return balance;
        }

        public String getName() {
            return name;
        }

        public void setName(String myName) {
            this.name = name;
        }
    }