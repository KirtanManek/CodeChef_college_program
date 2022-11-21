/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */
public class TheWave {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> size = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());
		int q = size.get(1);
		int n = size.get(0);
		List<Integer> polynomial = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());
		Collections.sort(polynomial);
		Out: while (q-- > 0) {
			int x = Integer.parseInt(bufferedReader.readLine());
			int l = 0, r = n - 1, m = (l + r) / 2;
			while (true) {
				m = (r + l) / 2;
				if (r < l) break;
				if (x > polynomial.get(m)) {
					l = m + 1;
				} 
				else if (x < polynomial.get(m)) {
					r = m - 1;
				} 
				else {
					System.out.println(0);
					continue Out;
				}
			}
			if (x > polynomial.get(0)) m++;
			int neg = n - m;
			if (neg % 2 == 0) System.out.println("POSITIVE");
			else System.out.println("NEGATIVE");
		}
	}
}
