package money;

import java.util.*;

public class Account {
    Scanner sc = new Scanner(System.in);

    protected int accountNumber;
    protected float balance = 60000;

    savingsAccount s = new savingsAccount();
    currentAccount c = new currentAccount();

    public void accountDetails(int a, float b) {
        accountNumber = a;
        balance = b;
        System.out.println("Account Details:");
        System.out.println("Account Number: " + a);
        System.out.println("Balance: " + b);
    }

    public void Deposit(float m) {
        System.out.println("Enter amount to deposit: ");
        m = sc.nextFloat();
        balance = balance + m;
        System.out.println("Money deposited! Current account balance is: " + balance);
    }

    public void WithDraw(float m) {
        System.out.println("Enter amount to withdraw:");
        balance = balance - m;
        if (balance > c.minBalance) {
            balance = balance - m;
            System.out.println("Money has been withdrawed! The current balance is: " + balance);
        } else {
            System.out.println("Minimum balance will not be maintained. Withdraw less or deposit more");
        }
    }
}
