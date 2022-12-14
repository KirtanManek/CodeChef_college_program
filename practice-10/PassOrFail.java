/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */
public class PassOrFail
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    List<Integer> info = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    	    .map(Integer::parseInt)
                    	    .collect(toList());
           	    System.out.println((info.get(1) * 3) - (info.get(0) - info.get(1)) < info.get(2) ? "FAIL" : "PASS");
		}
	}
}
