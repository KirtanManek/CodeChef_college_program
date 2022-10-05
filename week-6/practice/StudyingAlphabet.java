import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferedReader.readLine();
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i = 0; i < n; i++){
		    String s1 = bufferedReader.readLine();
            boolean temp = true;
            for(int j = 0; j < s1.length(); j++){
                if(!s.contains(String.valueOf(s1.charAt(j)))) temp = false;
            }
            if(temp) System.out.println("Yes");
            else System.out.println("No");
		}
	}
}
