/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */

public class CarsAndBikes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		List<Integer> tyres = new ArrayList<>();
		int testCases = input.nextInt();
		for (int i = 0; i < testCases; i++){
		    tyres.add(input.nextInt());
		}
		
		for (int i = 0; i < testCases; i++){
		    int remains = tyres.get(i) % 4;
		    if(remains == 2) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
