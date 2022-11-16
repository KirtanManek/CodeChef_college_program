/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */
public class Mahasena {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		List<Integer> info = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());
		int even = 0, odd = 0;
		for (int i = 0; i < n; i++) {
			if (info.get(i) % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println(even > odd ? "READY FOR BATTLE" : "NOT READY");
	}
}
