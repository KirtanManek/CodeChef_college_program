/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */

public class DegreeOfPolynomial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		List<Integer>[] poly = new ArrayList[n];
		
		for(int i = 0; i < n; i++){
		    int terms = input.nextInt();
		    poly[i] = new ArrayList<Integer>();
		    for (int j = 0; j < terms; j++){
		        poly[i].add(input.nextInt());
		    }
		    int ans = 0;
		    for (int j = 0; j < poly[i].size(); j++)
                if (poly[i].get(j) != 0) ans = j;
		    System.out.println(ans);
		}
	}
}
