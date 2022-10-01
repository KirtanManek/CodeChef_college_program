/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
public class Lapindromes {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			String str = bufferedReader.readLine();
			String s1 = str.substring(0, str.length() / 2), s2;
			if (str.length() % 2 == 0) {
				s2 = str.substring(str.length() / 2);
			} else {
				s2 = str.substring((str.length() / 2) + 1);
			}
			char h1[] = s1.toCharArray();
			char h2[] = s2.toCharArray();
			Arrays.sort(h1);
			Arrays.sort(h2);
			s1 = String.copyValueOf(h1);
			s2 = String.copyValueOf(h2);
			if (s1.equals(s2))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
