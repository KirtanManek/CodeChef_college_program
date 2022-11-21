/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
public class PlayingWithStrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    int p = Integer.parseInt(bufferedReader.readLine());
		    List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(""))
            .map(Integer::parseInt)
            .collect(toList());
            
            List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(""))
            .map(Integer::parseInt)
            .collect(toList());
            
        Collections.sort(h1);
        Collections.sort(h2);
        System.out.println(h1.equals(h2) ? "YES" : "NO");
		}
	}
}
