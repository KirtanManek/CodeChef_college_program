/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
public class TestingRobot
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
			int temp = h.get(1);
            String a = bufferedReader.readLine();
            List<Integer> list = new ArrayList<>();
			list.add(h.get(1));
            
            for(int j = 0; j < a.length(); j++){
                if(a.charAt(j) == 'R') temp++;
				else temp--;
				list.add(temp);
            }
            
            List<Integer> newList = list.stream().distinct().collect(Collectors.toList());
            System.out.println(newList.size());
		}
	}
}
