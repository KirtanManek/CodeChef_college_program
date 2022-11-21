/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class IdAndShip
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
		    String p = sc.next();
            p = p.toLowerCase();
            if(p.equals("b")) System.out.println("BattleShip");
            else if(p.equals("c")) System.out.println("Cruiser");
            else if(p.equals("d")) System.out.println("Destroyer");
            else if(p.equals("f")) System.out.println("Frigate");
		}
	}
}
