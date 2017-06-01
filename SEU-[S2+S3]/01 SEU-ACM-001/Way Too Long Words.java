// Solution for problem: Way Too Long Words

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		for(int t=1;t<=n;++t){
			String s=in.next();
			if(s.length()<=10)
				System.out.println(s);
			else
				System.out.println(""+s.charAt(0)+(s.length()-2)+s.charAt(s.length()-1));
		}
	}
}
