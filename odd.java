
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        if(a%2==0)
        {
          System.out.println("Even");
        }
       else if(a<0)
        {
            System.out.println("Invalid");
        }
        else
        {
           System.out.println("Odd");
        }
	}
}
