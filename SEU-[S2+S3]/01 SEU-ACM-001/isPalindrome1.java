// Check if given string is a palindrome

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String s=in.next();
		boolean p=true;
		for(int i=0;i<s.length()/2;++i)
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				p=false;
				break;
			}
		if(p==true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
