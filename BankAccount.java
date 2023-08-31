package com.bankapplication;

import java.util.Scanner;

public class BankAccount {
	
	int balance;
	
	int previousTransaction;
	
	String customerName;
	
	String customerId;
	
	public BankAccount(String cname, String cid) {
		
		customerName = cname;
		
		customerId = cid;
		
	}
	
	public void deposit(int amount) {
		
		if(amount != 0) {
			
			balance = balance + amount;
			
			previousTransaction = amount;
		}
	}
	
	public void withdraw(int amount) {
		
		balance = balance - amount;
		
		previousTransaction = -amount;
		
	}

	public void getPreviousTransaction() {
		
		if(previousTransaction > 0) {
			
			System.out.println("Deposited:" + previousTransaction);
			
		}
		else if(previousTransaction < 0) {
			
			System.out.println("Withdraw:" +Math.abs(previousTransaction));
			
		}
		else {
			
			System.out.println("No transaction occured");
			
		}
	}

       public void showMenu() {
    	   
    	   char option ='\0';
    	   
    	   Scanner sc = new Scanner(System.in);
    	   
    	   System.out.println("Welcome" + customerName );
    	   
    	   System.out.println("Your Id is" + customerId );
    	   
    	   System.out.println();
    	   
    	   System.out.println("A. Check Balance");
    	   
    	   System.out.println("B. Deposit");
    	   
    	   System.out.println("C. Withdraw");
    	   
    	   System.out.println("D. Previous Transaction");
    	   
    	   System.out.println("E. Exit");
    	   
    	   do {
    		   
    		   System.out.println("*************************************");
    		   
    		   System.out.println("Enter an OPTION");
    		   
    		   System.out.println("*************************************");
    		   
    		   option = sc.next().charAt(0);
    		   
    		   switch(option) {
    		   
    		   case 'A':
    			   
    			   System.out.println("---------------------------------");
    			   
    			   System.out.println("Balance = " + balance);
    			   
    			   System.out.println("----------------------------------");
    			   
    			   System.out.println("\n");
    			   
    			   break;
    			   
    		   case 'B':
    			   
    			   System.out.println("----------------------------------");
    			   
    			   System.out.println("Enter The Amount to Deposit");
    			   
    			   System.out.println("-----------------------------------");
    			   
    			   int amount = sc.nextInt();
    			   
    			   deposit(amount);
    			   
    			   System.out.println("\n");
    			   
    			   break;
    			   
    		   case 'C' :
    			   
    			   System.out.println("-------------------------------------");
    			   
    			   System.out.println("Enter The Amount to Withdraw");
    			   
    			   System.out.println("--------------------------------------");
    			   
    			   int amount2 = sc.nextInt();
    			   
    			   withdraw(amount2);
    			   
    			   System.out.println("\n");
    			   
    			   break;
    			   
    		   case 'D' :
    			   
    			   System.out.println("---------------------------------------");
    			   
    			   getPreviousTransaction();
    			   
    			   System.out.println("----------------------------------------");
    			   
    			   System.out.println("\n");
    			   
    			   break;
    			   
    		   case 'E' :
    			   
    			   System.out.println("*****************************************");
    			   
    			   break;
    			   
    			default:
    				
    				System.out.println("Invalid Option!!, Please enter again");
    		   }
    		   
    		   
    	   }while(option != 'E');
    	   
    	   System.out.println("Thank you for using our services");
    	      
       }
}
































