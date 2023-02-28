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
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=10;j++)
	        {
	            System.out.print(i*j+"\t");
	        }
	        System.out.println("\t");
	    }
	    
	}
}
