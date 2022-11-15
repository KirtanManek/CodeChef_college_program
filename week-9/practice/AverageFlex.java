/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */
public class AverageFlex
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
				int min = 0, max = 0;
				for(int k = 0; k < p; k++){
					if(h.get(k) <= h.get(j)) min++;
					else max++;
				}
				if(min > max) count++;
			}
			System.out.println(count);
		}
	}
}
