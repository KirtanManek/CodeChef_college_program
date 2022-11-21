/* package codechef; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */

public class SpellBob {
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n-- > 0) {
			String upface = br.readLine();
			String btface = br.readLine();
			if ((upface.charAt(0) == 'o' || btface.charAt(0) == 'o')
					&& (upface.charAt(1) == 'b' || btface.charAt(1) == 'b')
					&& (upface.charAt(2) == 'b' || btface.charAt(2) == 'b')) {
                                
				System.out.println("yes");
                                
			} 
                        else if ((upface.charAt(0) == 'b' || btface.charAt(0) == 'b')
					&& (upface.charAt(1) == 'o' || btface.charAt(1) == 'o')
					&& (upface.charAt(2) == 'b' || btface.charAt(2) == 'b')) {
				
                                System.out.println("yes");
                                
			} 
                        else if ((upface.charAt(0) == 'b' || btface.charAt(0) == 'b')
					&& (upface.charAt(1) == 'b' || btface.charAt(1) == 'b')
					&& (upface.charAt(2) == 'o' || btface.charAt(2) == 'o')) {
				
                                System.out.println("yes");
                                
			} 
                        else System.out.println("no");
		}
	}
}
