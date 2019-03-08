
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int count = 0, num ;
		num = s.nextInt();
        while(num!= 0)
        {
            num /= 10;
            ++count;
        }
        System.out.println(""+count);
    	}
}
