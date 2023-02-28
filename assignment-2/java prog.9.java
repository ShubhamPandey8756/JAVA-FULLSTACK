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
	    for(int i=2;i<=n;i++)
	    {
	        int c=0;
	        for(int j=2;j<=n;j++)
	        {
	           if(i%j==0)
	           {
	               c++;
	           }
	        }
	        if(c==1)
	        {
	            System.out.print(i+" ");
	        }
	    }
	    
	}
}
