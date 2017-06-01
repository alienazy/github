// O(n) solution for: http://www.spoj.com/problems/CRAN02/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		int[] v=new int[1000000+1]; // 1-based array
		int[] freq=new int[20000000+1];
		int shift=10000000;
		for(int T=0;T<t;++T){
			int n=in.nextInt();
			long result=0;
			freq[0+shift]=1;
			for(int i=1;i<=n;++i){
				v[i]=in.nextInt();
				v[i]+=v[i-1];
				result+=freq[v[i]+shift];
				++freq[v[i]+shift];
			}
			System.out.println(result);
			for(int i=0;i<=n;++i)
				freq[v[i]+shift]=0;
		}
	}
}
