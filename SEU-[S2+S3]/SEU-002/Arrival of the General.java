// Solution for: http://codeforces.com/problemset/problem/144/A
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
		int max=v[0],index=0;
		for(int i=1;i<n;++i)
			if(max<v[i]){
				max=v[i];
				index=i;
			}
		int result=0;
		while(index>0){
			int temp=v[index-1];
			v[index-1]=v[index];
			v[index]=temp;
			--index;
			++result;
		}
		int min=v[0];
		index = 0;
		for(int i=1;i<n;++i)
			if(min>=v[i]){
				min=v[i];
				index=i;
			}
		while(index<n-1){
			int temp=v[index+1];
			v[index+1]=v[index];
			v[index]=temp;
			++index;
			++result;
		}
		System.out.println(result);
	}
}
