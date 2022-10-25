/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */

public class CorrectSlippers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
            
            int ans = 0;
            
            if((h.get(1) * 2) <= h.get(0)){
                ans = h.get(1) * h.get(2);
            }
            else{
                ans = (h.get(0) - h.get(1)) * h.get(2);
            }
            System.out.println(ans);
		}
	}
}
