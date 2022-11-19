/* package codechef; // don't place package name! */

import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/* Change the class name to "Codechef" and remove public. */
public class DivineWords
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String divine = bufferedReader.readLine();
		List<String> divineList = new ArrayList<String>(Arrays.asList(divine.split("")));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    String str = bufferedReader.readLine();
		    List<String> strList = new ArrayList<String>(Arrays.asList(str.split("")));
			System.out.println(divineList.containsAll(strList) ? "Yes" : "No");
		}
	}
}
