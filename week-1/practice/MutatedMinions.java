/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */

public class MutatedMinions
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int machine = input.nextInt();
		for (int i = 0; i < machine; i++){
		    int minions = input.nextInt();
		    int ans = 0;
		    int k = input.nextInt();
		    for (int j = 0; j < minions; j++){
		        int e = input.nextInt();
		        if ((e+k) % 7 == 0) ans++;
		    }
		    System.out.println(ans);
		}
		input.close();
	}
}
