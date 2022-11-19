/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
public class TodoList
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    	int size = Integer.parseInt(bufferedReader.readLine());
		    	List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
			.map(Integer::parseInt)
			.collect(toList());
			int count = 0;;
			for(int j = size; j - 1 > 0; j--){
				if(h.get(j - 1) <= 7) break;
				else count++;
			}
			System.out.println(size - count);
		}
	}
}
