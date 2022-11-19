/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */

public class TheWoddenPlates
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    	long totalPlates = Long.parseLong(bufferedReader.readLine());
            		if(totalPlates == 0 || totalPlates == 1) {
                		System.out.println(totalPlates);
            		}
            		else{
                		System.out.println(((totalPlates - 1) / 2) + 1);    
            		}
		}
	}
}
