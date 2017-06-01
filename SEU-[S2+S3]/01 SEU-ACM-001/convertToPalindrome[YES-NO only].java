// Check if it is possible to re-order the letters of
// the given string to form a palindrome
// Print YES or NO

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String s=in.next();
		int[] freq=new int[26];
		for(int i=0;i<26;++i)
			freq[i]=0;
		for(int i=0;i<s.length();++i)
			++freq[s.charAt(i)-'a'];
		int odd=0;
		for(int i=0;i<26;++i)
			if(freq[i]%2==1)
				++odd;
		if(odd<=1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
