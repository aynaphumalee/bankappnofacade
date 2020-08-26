/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facade object = new Facade();
        AccountIf account = null;
        
        CustomerIf customer1 = object.getBankCustomer("John");
        System.out.println("Customer and account information");
        System.out.println("Name = " + customer1.getCustomerName());
        System.out.println("Has " + customer1.getNumAccounts() + " accounts");
        
        account = object.getBankAccount(customer1, 12345);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
        account = object.getBankAccount(customer1, 12346);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
        
        System.out.println("--- Do Deposit Account 12346 ---");
        object.doDeposit(1000,customer1,12346);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
         
        System.out.println("--- All Account ---");
        ArrayList<AccountIf> accounts1 = object.getBankCustomer("John").getllAccounts();
        for(AccountIf accounted : accounts1) {
            System.out.println("Account number " + accounted.getAccountNumber() + " has " + accounted.getBalance());
        }
        
        System.out.println("===================================");
        
        CustomerIf customer2 = object.getBankCustomer("Test");
        System.out.println("Customer and account information");
        System.out.println("Name = " + customer2.getCustomerName());
        System.out.println("Has " + customer2.getNumAccounts() + " accounts");
        
        account = object.getBankAccount(customer2, 12347);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
        account = object.getBankAccount(customer2, 12348);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
        
        System.out.println("--- Do Deposit Account 12348 ---");
        object.doDeposit(1000, customer2, 12348);
        System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
         
        System.out.println("--- All Account ---");
        ArrayList<AccountIf> accounts2 = object.getBankCustomer("Test").getllAccounts();
        for(AccountIf accounted : accounts2) {
            System.out.println("Account number " + accounted.getAccountNumber() + " has " + accounted.getBalance());
        }
    }
    
}
