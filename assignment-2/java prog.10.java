/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static boolean Armstrong(int n)
    {
     int original=n;
	 int p=1;
	 int c=0;
	 while(p<=n)
	 {
	     p*=10;
	     c+=1;
	 }
	 int sum=0;
	 while(n!=0)
	 {
	     int x=n%10;
	     sum+=Math.pow(x,c);
	     n=n/10;
	 }
	 return sum==original;
    }
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	        if(Armstrong(i))
	        {
	            System.out.println(i);
	        }
	    }
	}
}
