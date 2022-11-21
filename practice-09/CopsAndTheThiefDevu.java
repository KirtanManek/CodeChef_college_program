/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */
public class CopsAndTheThiefDevu
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    	List<Integer> info = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            			.map(Integer::parseInt)
            			.collect(toList());
            		List<Integer> house = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            			.map(Integer::parseInt)
            			.collect(toList());
			Collections.sort(house);
			List<Integer> remaining = new ArrayList<>();
			for(int j = 1; j <= 100; j++) remaining.add(j);
            		int houses = info.get(1) * info.get(2);
            		int min = 0, max = 0;
            		for(int j = 0; j < house.size(); j++){
				min = Math.max(house.get(j) - houses, 0);
				max = Math.min(house.get(j) + houses, 100);
				for(int k = min; k <= max; k++) remaining.remove(new Integer(k));
            		}
			System.out.println(remaining.size());
		}
	}
}
