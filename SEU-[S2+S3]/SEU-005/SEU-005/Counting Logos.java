// Solution for: http://codeforces.com/group/BDIXyZZHhT/contest/205589/problem/E


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static int R,C;
	static int[][] g;
	static boolean[][] vis;
	static int[] dr={-1,0,1,0};
	static int[] dc={0,1,0,-1};
	static void DFS(int r,int c){
		vis[r][c]=true;
		for(int d=0;d<4;++d){
			int nr=r+dr[d];
			int nc=c+dc[d];
			if(nr<0 || nc<0 || nr==R || nc==C || vis[nr][nc] || g[nr][nc]!=g[r][c])
				continue;
			DFS(nr,nc);
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line=in.readLine();
		line=in.readLine();
		StringTokenizer st=new StringTokenizer(line);
		C=Integer.parseInt(st.nextToken());
		R=Integer.parseInt(st.nextToken());
		in.readLine();
		g=new int[R][C];
		vis=new boolean[R][C];
		for(int i=0;i<R;++i){
			line=in.readLine();
			st=new StringTokenizer(line);
			for(int j=0;j<C;++j)
				g[i][j]=Integer.parseInt(st.nextToken());
		}
		int white=0,black=0;
		for(int r=0;r<R;++r)
			for(int c=0;c<C;++c)
				if(vis[r][c]==false){
					DFS(r,c);
					if(g[r][c]==0)
						++black;
					else
						++white;
				}
		--white;
		int android=white/2;
		int total=black/4;
		int windows=total-android;
		if(windows>android)
			System.out.println("Hasan");
		else if(windows<android)
			System.out.println("Bahosain");
		else
			System.out.println("Tie");
		System.out.println(windows+" "+android);
	}
}
