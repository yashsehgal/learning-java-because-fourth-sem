import java.io.*;
import java.util.*;

class Customer {
  public static long customerAmount = 000000000L;
  public static String customerName = new String("None");
  public static String customerDescription = new String("None");
  public Customer() {
    System.out.println("New customer has been created!");
  }
  public static void createCustomer(long initialBalance,  String _customerName, String _customerDescription ) {
    customerAmount = initialBalance;
    customerName = _customerName;
    customerDescription = _customerDescription;
    System.out.println("A new customer has been added to the Bank");
    System.out.println("Customer Name: " + customerAmount);
    System.out.println("Customer Description: " + customerDescription);
    System.out.println("Customer Current Bank Balance: " + customerAmount);
  }
  public static void addAmount(long amountToAdd) {
    if (amountToAdd <= 0) {
      System.out.println("Please provide some amount to add to the current balance.");
    } else {
      customerAmount += amountToAdd;
      System.out.println("Amount (" + amountToAdd + ") has been added to you current balance successfully.");
      System.out.println("Current Balance in Bank Account: " + customerAmount);
    }
  }
  public static void debitAmount(long amountToDebit) {
    if (amountToDebit <= 0) {
      System.out.println("Please provide some amount to debit from the current balance");
    } else {
      customerAmount -= amountToDebit;
      System.out.println("Amount (" + amountToDebit + ") has been debited from your current balance");
      System.out.println("Current Balance in Bank Account: " + customerAmount);
    }
  }
  public static long getCurrentBalance() {
    return customerAmount;
  }
  public static void main(String args[]) {
    System.out.println("");
  }
}

public class Solution {
  public static void main(String args[]) {
    Customer tonyStark = new Customer();
    tonyStark.createCustomer(10000000000L, "Iron Man", "Thanos Killer");
    System.out.println("Current Balance in " + tonyStark.customerName + "'s bank account is: " + tonyStark.getCurrentBalance());
    // adding some amount into current-balance
    tonyStark.addAmount(45900000L);
    System.out.println("Current Balance in " + tonyStark.customerName + "'s bank account is: " + tonyStark.getCurrentBalance());
    // debiting some amount from current-balance
    tonyStark.debitAmount(340000L);
    System.out.println("Current Balance in " + tonyStark.customerName + "'s bank account is: " + tonyStark.getCurrentBalance());    
  }
}
