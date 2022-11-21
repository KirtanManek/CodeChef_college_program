/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		List<String> h = new ArrayList<>(List.of("A", "E", "I", "O", "U"));
		String p = bufferedReader.readLine();
        if(h.contains(p)) System.out.println("Vowel");
        else System.out.println("Consonant");
	}
}
