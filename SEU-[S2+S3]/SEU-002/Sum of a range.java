// Sum of a range in O(1)

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] v=new int[n+1]; // 1-based array
		for(int i=1;i<=n;++i)
			v[i]=in.nextInt();
		int[] cs=new int[n+1];
		for(int i=1;i<=n;++i)
			cs[i]=cs[i-1]+v[i];
		int queries=in.nextInt();
		for(int q=0;q<queries;++q){
			int l=in.nextInt();
			int r=in.nextInt();
			int result=cs[r]-cs[l-1]; // get sum in O(1) per query
			System.out.println(result);
		}
	}
}
