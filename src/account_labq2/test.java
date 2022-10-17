/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account_labq2;

/**
 *
 * @author zuhud
 */
public class test {
        public static void main(String[] args) {
        // TODO code application logic here
        account account = new account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        System.out.println("Account Balance: $" + account.getBalance());
        
        account.withdraw(2500.0);
        System.out.println("Account Balance: $" + account.getBalance());
        
        account.deposit(3000.0);
        System.out.println("Account Balance: $" + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());

   }
}
