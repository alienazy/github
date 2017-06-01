// Solution for problem: Chat room

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String s=in.next();
		String h="hello";
		int j=0;
		for(int i=0;i<s.length() && j<h.length();++i)
			if(s.charAt(i)==h.charAt(j))
				++j;
		if(j==h.length())
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
