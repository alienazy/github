// Solution for: uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=380
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	static int[] dr={-2,-2,-1,1,2,2,1,-1};
	static int[] dc={-1,1,2,2,1,-1,-2,-2};
	static int BFS(int sr,int sc,int tr,int tc){
		int[][] cost=new int[8][8];
		for(int i=0;i<8;++i)
			for(int j=0;j<8;++j)
				cost[i][j]=-1;
		cost[sr][sc]=0;
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(sr);
		q.add(sc);
		while(q.size()>0){
			int r=q.poll();
			int c=q.poll();
			for(int d=0;d<8;++d){
				int nr=r+dr[d];
				int nc=c+dc[d];
				if(nr<0 || nc<0 || nr>=8 || nc>=8 || cost[nr][nc]!=-1)
					continue;
				cost[nr][nc]=cost[r][c]+1;
				if(nr==tr && nc==tc)
					return cost[nr][nc];
				q.add(nr);
				q.add(nc);
			}
		}
		return cost[tr][tc];
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String src=in.next();
			String dest=in.next();
			int sr=src.charAt(0)-'a';
			int sc=src.charAt(1)-'1';
			int tr=dest.charAt(0)-'a';
			int tc=dest.charAt(1)-'1';
			System.out.println("To get from "+src+" to "+dest+" takes "+BFS(sr,sc,tr,tc)+" knight moves.");
		}
	}
}