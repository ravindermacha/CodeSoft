import java.util.*;
public class Account {
	public static int Balance=5000;

	public static void main(String[] args) {
		double withdraw;
		double Deposit;
		double CheckBalance;
		Scanner sc=new Scanner(System.in);
		ATM ob=new ATM();
		  while(true)  
	        {  
	            System.out.println("Welcome to ATM Machine");  
	            System.out.println("Enter 1 To CheckBalance");  
	            System.out.println("Enter  2 for Withdraw");  
	            System.out.println("Enter  3 for Deposit");  
	            System.out.println("Enter  4 for EXIT");  
	            System.out.print("Choose the operation you want to perform:");  
	              
	            //get choice from user  
	            int choice = sc.nextInt(); 
	            switch(choice) {
	            case 1:ob.CheckBalance();
	                   break;
	            case 2:ob.Withdraw();
	                   break;
	            case 3:ob.Deposit();
	                   break;
	            case 4:System.exit(0);	            }
	}

}
}
