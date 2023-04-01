/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SavingAccount {

    private String accountID;
    private int balance;
    private int money;

    public SavingAccount(String accountID, int balance) {
        this.accountID = accountID;
        this.balance = balance;
    }


    public SavingAccount() {
        balance = 0;
        accountID = " ";
        money = 0;

    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

   
    public boolean savingWithdraw(int money) {
        if (money > 0 && money < balance) {
            balance = balance - money;
            return true;
        } else {
            return false;
        }
    }

    public boolean savingDeposit(int money) {

        if (money > 0) {
            balance = balance + money;
            return true;
        } else {
            return false;
        }
    }

    public int getMoney() {
        return balance;
    }
}
