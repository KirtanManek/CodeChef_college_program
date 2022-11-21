/* package codechef; // don't place package name! */
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class ChefAndTwoStrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    String s1 = bufferedReader.readLine();
		    String s2 = bufferedReader.readLine();
		    int count = 0, count2 = 0;
            
            for(int j = 0; j < s1.length(); j++)
            {
                if((s1.charAt(j) == '?' && s2.charAt(j) == '?') || (s1.charAt(j) == '?' && s2.charAt(j) != '?')|| (s2.charAt(j) == '?' && s1.charAt(j) != '?')) count++;
                else  if(s1.charAt(j) != s2.charAt(j) && s1.charAt(j) != '?' && s2.charAt(j) != '?') count2++;
            }
            System.out.println(count2 + " " + (count2 + count));
		}
	}
}
