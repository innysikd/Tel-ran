package controller;

import dao.Bank;
import data.BankAccount;
import data.Person;

public class BankApp{

        public static void main (String[]args){

            Person p1 = new Person(4567, "Nik", "Thompson", "Moscow");
            Person p2 = new Person(5687, "Mikhael", "Smit", "London");
            Person p3 = new Person(7892, "Jon", "Kraus", "Berlin");
            Person p4 = new Person(1122, "July", "Smidt", "Bristol");

            BankAccount account1 = new BankAccount(11234, p1, 2000);
            BankAccount account2 = new BankAccount(45832, p2, 45000);
            BankAccount account3 = new BankAccount(48756, p3, 34290);
            BankAccount account4 = new BankAccount(90876, p4, 234.5);

            Bank bank = new Bank(15);
            bank.addAccount(account1);
            bank.addAccount(account2);
            bank.addAccount(account3);
            bank.addAccount(account4);

            bank.display();
            System.out.println(bank.getBalanceOfBank());

            account1.debit(500);
            System.out.println(account1.getBalance());

            account2.credit(1200);
            System.out.println(account2.getBalance());

            System.out.println(bank.searchById(5687));
            System.out.println();

            bank.closeAccount(11234);

            bank.display();

            System.out.println("-----------");

            bank.display();

            System.out.println("-----------");

            bank.transferMoney(45832, 48756, 1500);

            System.out.println(account3.getBalance());

            System.out.println(bank.searchByLastName("leo"));



        }
}
