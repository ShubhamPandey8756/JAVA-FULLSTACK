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
	    int x=sc.nextInt();
	    int j=x;
	    int y=sc.nextInt();
	    int mul=1;
	    while(x>0)
	    {
	        mul=mul*(x%10);
	        x=x/10;
	    }
	    int finalans=j*mul;
	    if(finalans==y)
	    {
	        System.out.println("x is seed of y");
	    }
	    else{
	        System.out.println("No x is not seed of y");
	    }
	    
	}
}
