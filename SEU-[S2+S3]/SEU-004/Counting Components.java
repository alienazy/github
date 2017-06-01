// Counting Components
// Solution for: http://www.spoj.com/problems/CAM5/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static boolean[] vis;
	static ArrayList<ArrayList<Integer> > g;
	static void calc(int u){ // DFT = Depth-First Traversal
		vis[u]=true;
		for(int i=0;i<g.get(u).size();++i){
			int v=g.get(u).get(i);
			if(vis[v]==false)
				calc(v);
		}
	}
	// =============================================
	static String line;
	static StringTokenizer st;
	static BufferedReader in;
	static int readInt()  throws java.lang.Exception{
		while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(in.readLine());
        return Integer.parseInt(st.nextToken());
	}
	// =============================================
	public static void main (String[] args) throws java.lang.Exception
	{
		in = new BufferedReader(new InputStreamReader(System.in));
		st=new StringTokenizer("");
		int t=readInt();
		for(int T=0;T<t;++T){
			int n=readInt();
			g=new ArrayList<ArrayList<Integer> >();
			for(int i=0;i<n;++i)
				g.add(new ArrayList<Integer>());
			int m=readInt();
			for(int k=0;k<m;++k){
				int x=readInt();
				int y=readInt();
				//--x;--y;
				g.get(x).add(y);
				g.get(y).add(x);
			}
			vis=new boolean[n];
			int componentCount=0;
			for(int i=0;i<n;++i)
				if(vis[i]==false){
					calc(i);
					++componentCount;
				}
			System.out.println(componentCount);
		}
	}
}