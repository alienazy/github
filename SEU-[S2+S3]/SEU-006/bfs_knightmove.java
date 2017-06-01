// Solution for: uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=512

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static int n,A,B;
	static int BFS(){
		if(n==0)
			return 0;
		int[][] cost=new int[A+1][B+1];
		int[][] parentA=new int[A+1][B+1];
		int[][] parentB=new int[A+1][B+1];
		String[][] parentMove=new String[A+1][B+1];
		for(int i=0;i<=A;++i)
			for(int j=0;j<=B;++j)
				cost[i][j]=-1;
		cost[0][0]=0;
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(0);
		q.add(0);
		int na,nb;
		while(q.size()>0){
			int a=q.poll();
			int b=q.poll();
			if(b==n){
				int curA=a,curB=b;
				ArrayList<String> sol=new ArrayList<String>();
				while(curA!=0 || curB!=0){
					int nextA=parentA[curA][curB];
					int nextB=parentB[curA][curB];
					sol.add(parentMove[curA][curB]);
					curA=nextA;
					curB=nextB;
				}
				for(int i=sol.size()-1;i>=0;--i)
					System.out.println(sol.get(i));
				System.out.println("success");
				return cost[a][b];
			}
			if(a>0){
				na=0;
				nb=b;
				if(cost[na][nb]==-1){
					parentA[na][nb]=a;
					parentB[na][nb]=b;
					parentMove[na][nb]="empty A";
					
					cost[na][nb]=cost[a][b]+1;
					q.add(na);
					q.add(nb);
				}
			}
			if(b>0){
				na=a;
				nb=0;
				if(cost[na][nb]==-1){
					parentA[na][nb]=a;
					parentB[na][nb]=b;
					parentMove[na][nb]="empty B";
					
					cost[na][nb]=cost[a][b]+1;
					q.add(na);
					q.add(nb);
				}
			}
			if(a!=A){
				na=A;
				nb=b;
				if(cost[na][nb]==-1){
					parentA[na][nb]=a;
					parentB[na][nb]=b;
					parentMove[na][nb]="fill A";
					
					cost[na][nb]=cost[a][b]+1;
					q.add(na);
					q.add(nb);
				}
			}
			if(b!=B){
				na=a;
				nb=B;
				if(cost[na][nb]==-1){
					parentA[na][nb]=a;
					parentB[na][nb]=b;
					parentMove[na][nb]="fill B";
					
					cost[na][nb]=cost[a][b]+1;
					q.add(na);
					q.add(nb);
				}
			}
			if(a>0){
				int move=Math.min(a,B-b);
				na=a-move;
				nb=b+move;
				if(cost[na][nb]==-1){
					parentA[na][nb]=a;
					parentB[na][nb]=b;
					parentMove[na][nb]="pour A B";
					
					cost[na][nb]=cost[a][b]+1;
					q.add(na);
					q.add(nb);
				}
			}
			if(b>0){
				int move=Math.min(b,A-a);
				na=a+move;
				nb=b-move;
				if(cost[na][nb]==-1){
					parentA[na][nb]=a;
					parentB[na][nb]=b;
					parentMove[na][nb]="pour B A";
					
					cost[na][nb]=cost[a][b]+1;
					q.add(na);
					q.add(nb);
				}
			}
		}
		return -1;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt()){
			A=in.nextInt();
			B=in.nextInt();
			n=in.nextInt();
			BFS();
		}
	}
}
