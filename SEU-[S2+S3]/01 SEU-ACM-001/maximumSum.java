// Brute Force solution to solve the maximum sub-array problem:
// Find the maximum possible sum of a sub-array in the given array

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] v = new int[n];
		for(int i=0;i<n;++i)
			v[i]=in.nextInt();
		int maxSum = v[0];
		for(int i=0;i<n;++i){
			int curSum = 0;
			for(int j=i;j<n;++j){
				curSum += v[j];
				if(curSum > maxSum)
					maxSum=curSum;
			}
		}
		System.out.println(maxSum);
	}
}
