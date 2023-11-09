import java.util.Scanner;

public class ATMinterface {
    
    public static void main(String[] args){
        ATMinterface atm = new ATMinterface();

        int Balance = 2000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM");
        System.out.println();
while(true){
        System.out.println("Select Option:");
        System.out.println("1:Deposit");
        System.out.println("2:Withdraw");
        System.out.println("3:Check Balance");
        System.out.println("4:Exit");
        int userInput = sc.nextInt();
        int amount = 0;
        if(userInput==1 || userInput == 2){
            System.out.println("Enter your amount:");
            amount = sc.nextInt();
        }

        
        switch(userInput){
            case 1:
            Balance = atm.deposit(Balance,amount);
            break;
            case 2:
            if(amount > Balance){
            System.out.println("You cannot withdraw " + amount + "insufficient Balance");
            }else
            Balance = atm.withDraw(Balance,amount);
            break;
            case 3:
            Balance = atm.checkBalance(Balance);
            System.out.println("Your Available Balance is:" + Balance);
            break;
            case 4:
            System.out.println("Thank you for visiting have a nice day");
            break;
        }
        if(userInput==4) break;
        System.out.println();
    }
}
    private int checkBalance(int balance) {
        return balance;
    }

    private int withDraw(int balance, int amount) {
            balance -=amount;
        return balance;
    }

    private int deposit(int balance, int amount) {
        balance +=amount;
        return balance;
    }
}
