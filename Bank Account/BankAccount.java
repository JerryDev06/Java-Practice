import java.util.*;
class Account{
    double balance=0;
    @Override
    public String toString(){
        return "Balance: "+balance;
    }
    void withdraw(double amount){
        if(this.balance<=0){
            System.out.println("You are broke");
        }
        else if (this.balance<amount){
            System.out.println("Are You Serious Right Now");
        }
        else{
            this.balance-=amount;
            System.out.println("Here you go");
        }
    }
    void deposit(double money){
        this.balance+=money;    
        System.out.println("Small drops make a mighty ocean :)");
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Worst bank of India!");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("0. Exit");
        Account a = new Account();
        double amount;
        boolean bc = true;
        while (bc) {
            System.out.print("Enter your choice: ");
            int n = in.nextInt();
            switch(n){
                case 1 ->{
                    System.out.print("Enter the amount to Deposit: ");
                    amount = in.nextDouble();
                    a.deposit(amount);
                    System.out.println(a);
                }
                case 2 ->{
                    System.out.print("Enter the amount to Withdraw: ");
                    amount = in.nextDouble();
                    a.withdraw(amount);
                    System.out.println(a);
                }
                case 0 -> {
                    System.out.print("Thank you for using Worst bank of India :)");
                    in.close();
                    bc=false;
                }
                default -> System.out.println("Invalid input");
            }
        }
    }
}
