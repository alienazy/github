// Solution for: http://www.spoj.com/problems/PT07X/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static String line;
	static StringTokenizer st;
	static BufferedReader in;
	static int readInt()  throws java.lang.Exception{
		while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(in.readLine());
        return Integer.parseInt(st.nextToken());
	}
	static ArrayList<ArrayList<Integer> > g;
	static int answer;
	static boolean DFS(int u,int parent){
		boolean color=false; // false = white, true = black
		for(int i=0;i<g.get(u).size();++i)
			if(g.get(u).get(i)!=parent)
				if(DFS(g.get(u).get(i),u))
					color=true;
		if(color){
			++answer;
			return false;
		}
		return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		in=new BufferedReader(new InputStreamReader(System.in));
		int n=readInt();
		g=new ArrayList<ArrayList<Integer> >();
		for(int i=0;i<n;++i)
			g.add(new ArrayList<Integer>());
		for(int i=0;i<n-1;++i){
			int a=readInt();
			int b=readInt();
			--a;--b;
			g.get(a).add(b);
			g.get(b).add(a);
		}
		answer=0;
		DFS(0,-1);
		System.out.println(answer);
	}
}
