package dao;

import data.BankAccount;

public class Bank {

    private BankAccount[] accounts;  // arr named accounts in Class BankAccount
    int size;  // declares how many accounts are in the bank

    public Bank (int capacity){     //  constructor
        accounts = new BankAccount[capacity];
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public int checkAccount (int account){  // we check if the account already exists
        for (int i = 0; i<size; i++){
            if (account == accounts[i].getAccount()){
                return i;
            }
        }
        return -1;
    }

    public boolean addAccount(BankAccount account){
        if (checkAccount(account.getAccount())>=0){  // if the client exists
            return false;
        }
        if (size<accounts.length){  // and if there is enough space
            accounts[size] = account;
            size++;
            return true;
        }
        return false;  // can't open a new account
    }

    public boolean closeAccount (int account){
        int index = checkAccount(account);
        if (index<0) return false;
        accounts[index] = accounts[size-1]; //the last index (account) goes instead of the deleted one
        size --;  return true;
       }

    public void display(){
        for (int i = 0; i<size; i++){
            System.out.println(accounts[i]);
        }
    }

    public BankAccount[] findAll(){
        BankAccount[] res = new BankAccount[size];
        for (int i = 0; i<size; i++){
            res[i] = accounts[i];
        }
        return res;
    }

    public double getBalanceOfBank(){
        double sum = 0;
        for (int i=0; i<size; i++){
            sum = sum + accounts[i].getBalance();
        }
        return sum;
    }

    public BankAccount searchById (int id){
        for (int i = 0; i<size; i++){
            if (id == accounts[i].getOwner().getId()){
                return accounts[i];
            }
        }
        return null;
    }

    public boolean transferMoney (int accountFrom, int accountTo, double sum){
        int indexFrom = checkAccount(accountFrom);
        if (indexFrom<0){
            System.out.println("Withdraw account is incorrect. Please try again");
            return false;
        }
        int indexTo = checkAccount(accountTo);
        if (indexTo<0){
            System.out.println("Recipient account is incorrect. Please try again");
            return false;
        }
        if (!accounts[indexFrom].credit(sum)) {         // this declaration is true, but ! - means if "true"
            System.out.println("Transfer is not possible. No balance");
            return false;
        }else {
            accounts[indexTo].debit(sum);
            System.out.println("Operation successful");
            System.out.println(sum + "was transfered to " + accounts[indexTo].getOwner().getFirstName()
                    + accounts[indexTo].getOwner().getLastName());
            System.out.println("Your balance is " + accounts[indexFrom].getBalance());
            return true;
        }
    }

    public BankAccount searchByLastName (String lastName){
        for (int i = 0; i<size; i++){
            if (accounts[i].getOwner().getLastName().equalsIgnoreCase(lastName)){
                return accounts[i];
            }
        }
        System.out.println("It's not our client");
        return null;
    }
}
