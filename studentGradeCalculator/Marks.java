import java.util.*;
public class Marks {
public static void main(String[] args) {
	int sum=0;
	int Array[]=new int[6];
	Scanner sc=new Scanner(System.in);
	System.out.print("enter marks in each subject[Telugu,English,Hindi,Maths,Physics,Chemistry]:");
	for(int i=0;i<Array.length;i++) {
		Array[i]=sc.nextInt();
	}
	for(int i=0;i<Array.length;i++) {
		sum+=Array[i];
	}
	System.out.println("sum of the marks:"+sum);
	int average=sum/Array.length;
	System.out.println("average of the marks:"+average);
	 String grade = null;
     
     switch(average/10) {
       case 10:
       case 9:
          grade = "A";
          break;
       case 8:
          grade = "B";
          break;
       case 7:
          grade = "C";
          break;
        case 6:
          grade = "D";
          break;
       case 5:
          grade = "E";
          break;
       default:
          grade = "F";
          break;
     }
     
     System.out.println("Grade = " + grade);
  }
}
