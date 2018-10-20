package collection;

import java.util.ArrayList;

interface Account {
    static int accountCount = 0;
    String accountName = null;

    void deposit(int amount);

    void withdraw(int amount);

    double checkBalance();

}

class PayTMAccount implements Account {

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public double checkBalance() {
        return 0;
    }
}

class BankAccount implements Account {
    private String name;
    private double balance;
    private String statement;

    public BankAccount(String name, double balance, String statement) {
        this.name = name;
        this.balance = balance;
        this.statement = statement;
    }
    public void statement() {
        System.out.println(statement);
    }

    @Override
    public double checkBalance() {
        System.out.println(name + "'s Balance is: " + balance);
        return this.balance;
    }

    @Override
    public void withdraw(int n) {
        java.util.Date date = new java.util.Date();
        if (n > balance)
            System.out.println("Withdrawl amount is greater than balance");
        else {
            this.balance -= n;
            System.out.println("New balance is: " + this.balance);
            statement += "\n" + "deducted " + n + ", bal: " + this.balance + ", " + date;
        }
    }

    public void deposit(int n) {
        java.util.Date date = new java.util.Date();
        this.balance += n;
        System.out.println("New balance is: " + " " + this.balance);
        statement += "\n" + "added " + n + ", bal: " + this.balance + ", " + date;
    }

    public void zeroAccBal() {
        if (this.balance==0)
            System.out.print("\n"+this.name );
    }
}

public class BankAccountTester {
    public static void main(String[] args) {
        ArrayList<BankAccount> accountHolderList = new ArrayList<>();
        BankAccount a = new BankAccount("Rohan", 35000, "Rohan, bal: 35000");
        accountHolderList.add(a);
        BankAccount b = new BankAccount("Sohan", 30000, "Sohan, bal: 30000");
        accountHolderList.add(b);
        accountHolderList.add(new BankAccount("Tomy",0,"Tomy, bal:0"));
        accountHolderList.add(new BankAccount("John",0,"John, bal:0"));
        accountHolderList.get(0).deposit(1000);
        accountHolderList.get(0).withdraw(1000);
        accountHolderList.get(1).checkBalance();
        accountHolderList.get(0).statement();
        System.out.print("List of empty accounts are: ");
        for (int i=0; i<accountHolderList.size();i++) {
            accountHolderList.get(i).zeroAccBal();
        }

    }
}
