/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */
public class ChefAndSubarrays
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    int p = Integer.parseInt(bufferedReader.readLine());
		    List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
					.map(Integer::parseInt)
					.collect(toList());
			int count = 0;
            for(int j = 0; j < p; j++){
				int sum = h.get(j), product = h.get(j);
				for(int k = j + 1; k < p; k++){
					if(sum == product) count++;
					sum = sum + h.get(k);
					product = product * h.get(k);
				}
				if(sum == product) count++;
			}
			System.out.println(count);
		}
	}
}
