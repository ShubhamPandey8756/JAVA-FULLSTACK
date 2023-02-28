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
	    int i=1;
	    int sum=0;
	    while(n>0)
	    {
	        if(i%2!=0)
	        {
	           sum+=Math.pow(n%10,2); 
	        }
	       n=n/10;
	       i++;
	    }
	    if(sum%9==0)
	    {
	        System.out.println("yes it is Lucky number");
	    }
	    else{
	        System.out.println("No it is not a Lucky number");
	    }
	    
	}
}
