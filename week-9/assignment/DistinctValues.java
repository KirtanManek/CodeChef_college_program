/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
public class DistinctValues {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			int p = Integer.parseInt(bufferedReader.readLine());
			;
			List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
					.map(Integer::parseInt)
					.collect(toList());
			int[] a = h.stream().mapToInt(Integer::intValue).toArray();
			System.out.println(minimumOperations(a, p));
		}
	}

	private static int minimumOperations(int[] a, int n) {
		HashMap<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (mp.get(a[i]) != null) {
				int x = mp.get(a[i]);
				mp.put(a[i], ++x);
			} 
			else mp.put(a[i], 1);
		}

		int count = 0;
		for (HashMap.Entry<Integer, Integer> entry : mp.entrySet()) {
			if (entry.getValue() > 1) {
				count += (entry.getValue() - 1);
			}
		}
		return count;
	}
}
