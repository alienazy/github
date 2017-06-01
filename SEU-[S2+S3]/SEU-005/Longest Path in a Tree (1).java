// Longest Path in a Tree (1)
// Solution for: http://www.spoj.com/problems/PT07Z/

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
	static int maxLength,atNode;
	static void DFS(int u,int cost,int parent){
		if(maxLength<cost){
			maxLength=cost;
			atNode=u;
		}
		for(int i=0;i<g.get(u).size();++i)
			if(g.get(u).get(i)!=parent)
				DFS(g.get(u).get(i),cost+1,u);
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
		maxLength=-1;
		DFS(0,0,-1);
		int A=atNode;
		maxLength=-1;
		DFS(atNode,0,-1);
		int B=atNode;
		System.out.println(maxLength); // from A to B = maxLength
	}
}
