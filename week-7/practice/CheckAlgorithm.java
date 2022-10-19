import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */
public class CheckAlgorithm {
	public static int no_of_digits(int n) {
		if (n / 10 == 0)
			return 1;
		else
			return 1 + no_of_digits(n / 10);
	}

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int count = 0;
			String s = br.readLine();
			int k = 0;
			char ch = s.charAt(k);
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != ch) {
					count = count + 1 + no_of_digits(i - k);
					k = i;
					ch = s.charAt(k);
				}
			}
			count = count + 1 + no_of_digits(s.length() - k);

			if (count >= s.length())
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
