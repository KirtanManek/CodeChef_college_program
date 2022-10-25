/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */

public class CircularTrack
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++){
		    long a = input.nextLong();
		    long b = input.nextLong();
		    long m = input.nextLong();
		    long ans = 0, temp = 0;
		    if (a > b){
		        temp = a;
		        a = b;
		        b = temp;
		    }
            System.out.println(Math.min(b-a, m - b + a));
		}
	}
}
