import java.util.Scanner;

class Account{
    private String name;
    private double balance;

    Account(String name,double balance){
        this.name=name;
        if(balance<=0){
         this.balance=100;
        }else{
            this.balance=balance;
        }
    }
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited Successfully");
        }else{
            System.out.println("Invalid amount");
        }
    }
    void withdraw(double amount){
        if(amount>0 && balance-amount>0){
            System.out.println("Withdraw Successfully");
        }else{
            System.out.println("Not enough balance");
        }
    }
    void showInfo(){
        System.out.println("Name: "+name+" Balance: "+balance);
    }
    double getDouble(){
        return balance;
    }
}


public class BankATM {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        double balance;
        String name;
        Account acc=null;
       while(true){
        System.out.println("ATM  Menu:");
        System.out.println();
        System.out.println("1.Create Account");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Show Information");
        System.out.println("5.Exit");
        System.out.println("Enter choice: ");
        num=in.nextInt();
        switch(num){
            case 1:
             System.out.println("Enter any name: ");
             in.nextLine();
             name=in.nextLine();
             System.out.println("Enter initial balance: ");
             balance=in.nextDouble();
             acc=new Account(name, balance);
             System.out.println("Account created Successfully");
             break;
             case 2:
             if(acc!=null){
              System.out.println("Enter amount of deposit: ");
              double amt=in.nextDouble();
              acc.deposit(amt);
             }else{
                System.out.println("Account created first");
             }
             break;
             case 3:
             if(acc!=null){
              System.out.println("Enter amount of withdraw: ");
              double amt=in.nextDouble();
              acc.withdraw(amt);
             }else{
                System.out.println("Account created first");
             }
             break;
             case 4:
             if(acc!=null){
                acc.showInfo();

             }else{
                System.out.println("No account yet");
             }
             break;
             case 5:
               System.out.println("Thank you for using our ATM");
               return;
            default:
            System.out.println("Invalid choice! Try again.");   
        }
       }
    }
    
}