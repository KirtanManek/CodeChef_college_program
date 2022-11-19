/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */
public class ChefAndNewYearGifts
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
            		Collections.sort(h);
			int diff = Integer.MAX_VALUE;
			for(int j = 0; j < p - 1; j++){
				if(h.get(j + 1) - h.get(j) < diff) diff = h.get(j + 1) - h.get(j);
			}
			System.out.println(diff);
		}
	}
}
