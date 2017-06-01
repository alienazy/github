// Count the number of values in a range in O(logN)
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
		int[] v=new int[n];
		for(int i=0;i<n;++i)
			v[i]=in.nextInt();
		int A=in.nextInt();
		int B=in.nextInt();
		// 1 4 9 13 15
		//   ^   ^
		// 3 11
		int lower=n;
		int l=0,r=n-1,mid;
		while(l<=r){
			mid=(l+r)/2;
			if(v[mid]>=A){
				lower=mid;
				r=mid-1;
			}else
				l=mid+1;
		}
		int upper=n;
		l=0;
		r=n-1;
		while(l<=r){
			mid=(l+r)/2;
			if(v[mid]>B){
				upper=mid;
				r=mid-1;
			}else
				l=mid+1;
		}
		System.out.print(upper-lower);
	}
}
