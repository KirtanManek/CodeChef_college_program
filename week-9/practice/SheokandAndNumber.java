/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */

public class SheokandAndNumber {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i <= 30; i++) {
			for (int j = 0; j <= 30; j++) {
				if (i != j) set.add((int)(Math.pow(2, i) + Math.pow(2, j)));
			}
		}
		int t = Integer.parseInt(bufferedReader.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(bufferedReader.readLine());
			if (n < 3) {
				System.out.println(3 - n);
				continue;
			}
			System.out.println(Math.min(n - set.floor(n), set.higher(n) - n));
		}
	}
}
