/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account_labq2;
import java.time.LocalDate;  
import java.time.format.DateTimeFormatter;  
/**
 *
 * @author zuhud
 */
public class account {

    /**
     * @param args the command line arguments
     */
    
    private int ID = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private LocalDate dateCreated;
    

    public account() 
    {
    }

    public account(int id, double balance) 
    {
        this.ID = id;
        this.balance = balance;
    }
    
    
    public int getID() 
    {
        return this.ID;
    }
    public void setID(int id) 
    {
        this.ID = id;
    }

    public double getBalance() 
    {
        return this.balance;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    
    public double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }
    
    public LocalDate getDateCreated() 
    {
        dateCreated = LocalDate.now();
        return dateCreated;
    }


    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    } 
}
    

