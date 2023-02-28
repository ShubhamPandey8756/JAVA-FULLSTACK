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
	 int original=n;
	 int sum=0;
	 while(n!=0)
	 {
	     sum+=n%10;
	     n=n/10;
	 }
	 if(original%sum==0)
	 {
	     System.out.println("yes");
	 }
	 else{
	     System.out.println("No");
	 }
	}
}
