/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int n=sc.nextInt();
	 int count=0;
	 for(int i=2;i<=n;i++)
	 {
	     if(n%i==0)
	     {
	         count++;
	     }
	 }
	 if(count==1)
	 {
	     System.out.println("No is prime");
	 }
	 else{
	      System.out.println("No is Not prime");
	 }
	}
}
