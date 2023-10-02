
import java.util.*;
class Test {
	public static void main(String[] args){
		playGame();
	}
	static int count=0;
		public static void playGame() {
			count++;
			if(count==5) {
				System.out.println("You have played maximum Number of times:Thank you for playing game");
				return;
			}
		System.out.print("enter a number:");
		Scanner sc=new Scanner(System.in);
		int guess=sc.nextInt();
		
		int randomNumer = (int) (Math.floor( Math.random()*100 ) + 1);
		if(guess<randomNumer) {
			System.out.println("your guess is too low");
			playAgain();
		}
		else if(guess==randomNumer) {
			System.out.println("Your guess is correct");
		}
		else {
			System.out.println("your guess is too high");
			playAgain();
		}
		}
   public static void playAgain() {
	   
	   System.out.print("are you want to play agian:");
	   Scanner sc=new Scanner(System.in);
	   String choose=sc.nextLine();
	   if(choose.equalsIgnoreCase("No")) {
		   System.out.println("thank you for playing game");
		   
	   }
	   else if(choose.equalsIgnoreCase("Yes")) {
		   playGame();
	   }
		// TODO Auto-generated method stub
		
 
}
}
