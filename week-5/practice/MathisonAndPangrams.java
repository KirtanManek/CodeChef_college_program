/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
public class MathisonAndPangrams {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
					.map(Integer::parseInt)
					.collect(toList());
			String a = bufferedReader.readLine();
			int ans = 0;

			for (int j = 'a'; j <= 'z'; j++) {
				ans += (a.indexOf(j) < 0 ? h.get(j - 'a') : 0);
			}
			System.out.println(ans);
		}
	}
}
