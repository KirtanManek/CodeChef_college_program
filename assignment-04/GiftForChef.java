/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
public class GiftForChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        	long n = Long.parseLong(bufferedReader.readLine());
        	for(int i = 0; i < n; i++){
            		List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
             			.map(Integer::parseInt)
             			.collect(toList());
             		if(h.get(1) >= h.get(0) && h.get(3) >= h.get(2) && h.get(5) <= h.get(4)) System.out.println("YES");
             		else System.out.println("NO");
        	}
	}
}
