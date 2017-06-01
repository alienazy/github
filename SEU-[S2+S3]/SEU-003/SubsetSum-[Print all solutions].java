// Subset Sum (Print all solutions)
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static int n,k;
	static int[] val;
	static ArrayList sol;
	static int count;
	static void calc(int i, int curSum){
		if(curSum==k){
			System.out.println(sol);
			++count;
			return;
		}
		if(i==n)
			return;
		sol.add(val[i]);
		calc(i+1,curSum+val[i]);
		sol.remove(sol.size()-1);
		calc(i+1,curSum);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		k=in.nextInt();
		val=new int[n];
		sol=new ArrayList<Integer>();
		for(int i=0;i<n;++i)
			val[i]=in.nextInt();
		count=0;
		calc(0,0);
		System.out.println(count);
	}
}
