/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
public class ChefAndTableTennis
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(""))
            .map(Integer::parseInt)
            .collect(toList());
            
            int one = Collections.frequency(h, 1);
            int zero = Collections.frequency(h, 0);
            if(one > zero + 1 && one >= 11) System.out.println("WIN");
            else System.out.println("LOSE");
		}
	}
}
