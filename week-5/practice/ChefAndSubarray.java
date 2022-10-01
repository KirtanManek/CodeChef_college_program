/* package codechef; // don't place package name! */
// problem code : CHEFZOT

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
public class ChefAndSubarray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int currentLength = 0, maxLength = 0;
		int n = Integer.parseInt(bufferedReader.readLine());
		List<Integer> h = Stream.of(bufferedReader.readLine().split(" "))
            .map(Integer::parseInt)
            .collect(toList());
		for(int i = 0; i < n; i++){
	        if(h.get(i) == 0) {
                maxLength = Math.max(currentLength, maxLength);
                currentLength = 0;
            }
            else {
                currentLength++;
            }
		}
		maxLength = Math.max(currentLength, maxLength);
		System.out.println(maxLength);
	}
}
