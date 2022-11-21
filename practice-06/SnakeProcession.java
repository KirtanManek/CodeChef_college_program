/* package codechef; // don't place package name! */
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class SnakeProcession {
    public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    int p = Integer.parseInt(bufferedReader.readLine());
		    String str = bufferedReader.readLine();
		    str = str.replace(".", "");
		    if(str.length() % 2 == 0 && str.startsWith("H") && str.endsWith("T")){
                if(str.contains("TT") || str.contains("HH")) System.out.println("Invalid");
                else System.out.println("Valid");
            }
            else if(str.equals("")) System.out.println("Valid");
            else System.out.println("Invalid");
		}
	}
}
