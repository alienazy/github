// solution for: http://codeforces.com/contest/600/problem/B
// lower_bound: first element greater than or equal to the required value
// upper_bound: first element greater than the required value

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int[] a=new int[n];
		int[] b=new int[m];
		for(int i=0;i<n;++i)
			a[i]=in.nextInt();
		for(int i=0;i<m;++i)
			b[i]=in.nextInt();
		ArrayList lst=new ArrayList<Integer>();
		for(int i=0;i<n;++i)
			lst.add(a[i]);
		Collections.sort(lst); // faster than Arrays.sort(a);
		for(int i=0;i<n;++i)
			a[i]=(int)lst.get(i);
		for(int i=0;i<m;++i){
			int answer=n;
			int l=0,r=n-1,mid;
			while(l<=r){
				mid=(l+r)/2;
				if(a[mid]>b[i]){ // upper_bound
					answer=mid;
					r=mid-1;
				}else
					l=mid+1;
			}
			if(i>0)
				System.out.print(" ");
			System.out.print(answer);
		}
	}
}
