/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */

public class AreaOrPerimeter
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		long l = Long.parseLong(bufferedReader.readLine());
		long b = Long.parseLong(bufferedReader.readLine());
		
// 		System.out.println(l * b > 2*(l + b) ? "Area" : "Peri");
// 		System.out.println(Math.max(l * b, 2*(l + b)));
        if(l * b > 2 * (l + b)){
            System.out.println("Area");
            System.out.println(l * b);
        }
        else if(l * b < 2 * (l + b)){
            System.out.println("Peri");
            System.out.println(2 * (l + b));
        }
        else{
            System.out.println("Eq");
            System.out.println(2 * (l + b));
        }
	}
}
