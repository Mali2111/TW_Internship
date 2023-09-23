
package ATMInterface;
import java.util.*;  
public class Task3 { 
	    public static void main(String []args)
	    {  
	        int balance = 5000, withdraw, deposit;  
	       try( Scanner sc = new Scanner(System.in))
	       {
	        System.out.println("Avilable Balance="+balance);  
	        while(true)  
	        {  
	           
	            System.out.println("Enter 1 for Withdraw");  
	            System.out.println("Enter 2 for Deposit");  
	            System.out.println("Enter 3 for Check Balance");  
	            System.out.println("Enter 4 for EXIT");  
	            System.out.print("Enter the operation you want to perform:");  
	            int choice = sc.nextInt();  
	            switch(choice)  
	            {  
	                case 1:  
	        System.out.print("Enter money to be withdrawn:");   
	        withdraw = sc.nextInt();  
	        if(balance >= withdraw)  
	        {  
	            
	            balance = balance - withdraw;  
	            System.out.println("Please collect your money");  
	        }  
	        else  
	        {  
	            System.out.println("Insufficient Balance");  
	        }  
	        System.out.println("");  
	        break;  
	   
	                case 2:
	        System.out.print("Enter money to be deposited:");    
	        deposit = sc.nextInt();   
	        balance = balance + deposit;  
	        System.out.println("Your Money has been successfully depsited");  
	        System.out.println("");  
	        break;  
	   
	                case 3: 
	        System.out.println("Balance : "+balance);  
	        System.out.println("");  
	        break;  
	   
	                case 4:  
	        System.exit(0);  
	            }  
	        }  
	    }  
	
	    }  
}