/* package codechef; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */

public class PrintPattern {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		while (cases > 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];
			int c = 1;
			for (int l = 0; l < n; l++) {
				int i = 0;
				for (int j = l; j >= 0; j--)
					arr[i++][j] = c++;
			}
			for (int l = 1; l < n; l++) {
				int i = n - 1;
				for (int j = l; j < n; j++)
					arr[j][i--] = c++;
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			cases--;
		}
	}
}
