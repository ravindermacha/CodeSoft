import java.util.*;

public class ATM {
	static Scanner sc=new Scanner(System.in);

public static void Deposit() {
	System.out.println("Enter the amount to deposit:");
	int DepositAmount=sc.nextInt();	
	Account.Balance+=DepositAmount;
	System.out.println("Successfully Deposited in your Bank Account");
	
}
public static void Withdraw() {
	System.out.println("Enter the amount to Withdraw:");
	int WithdrawAmount=sc.nextInt();
	if(WithdrawAmount>Account.Balance) {
		System.out.println("Insufficient balance:");
	}
		else {
			Account.Balance-=WithdrawAmount;
			System.out.println("Please collect your cash");
		}
	}
public static void CheckBalance() {
	System.out.println("Balance amount is:" +Account.Balance);
}
}


