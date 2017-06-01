// Subset Sum (Print one solution)
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static int n,k;
	static int[] val;
	static ArrayList sol;
	static boolean calc(int i, int curSum){
		if(curSum==k)
			return true;
		if(i==n)
			return false;
		sol.add(val[i]);
		if(calc(i+1,curSum+val[i]))
			return true;
		sol.remove(sol.size()-1);
		return calc(i+1,curSum);
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
		if(calc(0,0)){
			System.out.println("YES");
			System.out.println(sol);
		}else
			System.out.println("NO");
	}
}
