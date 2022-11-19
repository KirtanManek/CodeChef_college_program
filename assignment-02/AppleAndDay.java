/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		        List<Double> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Double::parseDouble)
                                .collect(toList()); 
                        System.out.println((int)Math.ceil(h.get(0) / h.get(1)));
		}
	}
}
