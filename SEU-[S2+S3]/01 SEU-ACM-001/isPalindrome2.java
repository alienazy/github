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
		int i=0,j=s.length()-1;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)){
				p=false;
				break;
			}
			++i;
			--j;
		}
		if(p==true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
