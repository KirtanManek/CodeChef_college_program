/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */
public class SumOrDifference
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner sc = new Scanner(System.in);
	        int n1 = sc.nextInt();
	        int n2 = sc.nextInt();
                System.out.println(n1 > n2 ? n1 - n2 : n1 + n2);
	}
}
