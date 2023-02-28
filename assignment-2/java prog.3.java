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
	 int r=0;
	 while(n!=0)
	 {
	    r=r*10+n%10;
	    n=n/10;
	 }
	 System.out.println("reverse is " +r);
	}
}
