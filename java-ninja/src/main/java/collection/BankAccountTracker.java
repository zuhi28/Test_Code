package collection;
import java.util.ArrayList;

class AccountInfo {
    private String accountHolder;
    private int balance;
    public AccountInfo(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
//        AccountInfo holder1 = new AccountInfo("Rohan", 20000);
//        AccountInfo holder2 = new AccountInfo("John", 0);
//        AccountInfo holder3 = new AccountInfo("Jack", 0);
//        AccountInfo holder4 = new AccountInfo("Jack", 50000);
//        AccountInfo holder5 = new AccountInfo("Abrahm", 0);
//        accounts.add(holder1);
//        accounts.add(holder2);
//        accounts.add(holder3);
//        accounts.add(holder4);
//        accounts.add(holder5);
    }

    @Override
    public String toString() {
        return "AccountInfo{" +
                "accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
//                ", allBalance='" + allBalance + '\'' +
//                ", accounts=" + accounts +
                '}';
    }
}

public class BankAccountTracker {
    public static void main(String[] args){
        String allbalance;
        ArrayList<AccountInfo> accounts = new ArrayList<AccountInfo>();
        AccountInfo holder6 = new AccountInfo("Jass",2000);
        accounts.add(holder6);
        AccountInfo holder7 = new AccountInfo("Anni",2050);
        accounts.add(holder7);
        AccountInfo holder1 = new AccountInfo("Rohan", 20000);
        accounts.add(holder1);
        AccountInfo holder2 = new AccountInfo("John", 0);
        accounts.add(holder2);
        System.out.println(accounts);
    }

}
