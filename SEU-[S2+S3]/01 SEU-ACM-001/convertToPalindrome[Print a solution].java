// Check if it is possible to re-order the letters of
// the given string to form a palindrome
// Print YES or NO, and print a solution if YES

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
		if(odd<=1){
			System.out.println("YES");
			char oddChar='.';
			if(odd==1){
				for(int i=0;i<26;++i)
					if(freq[i]%2==1){
						oddChar=(char)(i+'a');
						--freq[i];
						break;
					}
			}
			for(int i=0;i<26;++i)
				for(int j=0;j<freq[i]/2;++j)
					System.out.print((char)(i+'a'));
			if(odd==1)
				System.out.print(oddChar);
			for(int i=25;i>=0;--i)
				for(int j=0;j<freq[i]/2;++j)
					System.out.print((char)(i+'a'));
			System.out.println("");
		}else
			System.out.println("NO");
	}
}
