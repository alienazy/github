// Solution For: http://codeforces.com/contest/377/problem/A

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static boolean[][] vis;
	static String[] g;
	static int keep,n,m;
	static void calc(int r,int c){ // DFT = Depth-First Traversal
		if(keep==0)
			return;
		if(r<0 || r==n || c<0 || c==m)
			return;
		if(g[r].charAt(c)=='#')
			return;
		if(vis[r][c])
			return;
		--keep;
		vis[r][c]=true;
		calc(r-1,c); // up
		calc(r+1,c); // down
		calc(r,c-1); // left
		calc(r,c+1); // right
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line=in.readLine();
		StringTokenizer st=new StringTokenizer(line);
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		vis=new boolean[n][m];
		g=new String[n];
		int dots=0;
		int r=0,c=0;
		for(int i=0;i<n;++i){
			g[i]=in.readLine();
			for(int j=0;j<m;++j)
				if(g[i].charAt(j)=='.'){
					++dots;
					r=i;
					c=j;
				}
		}
		keep=dots-k;
		calc(r,c);
		for(int i=0;i<n;++i){
			for(int j=0;j<m;++j)
				if(g[i].charAt(j)=='#')
					System.out.print("#");
				else if(vis[i][j]==false)
					System.out.print("X");
				else
					System.out.print(".");
			System.out.println("");
		}
	}
}
