// 8-Queen

import java.util.*;
import java.lang.*; 
import java.io.*;

public class Main
{
	static String[] g;
	static int[] at;
	static boolean can(int r,int c){
		if(g[r].charAt(c)=='#')
			return false;
		for(int i=0;i<r;++i){
			int row=i;
			int col=at[i];
			if(c==col)
				return false;
			if(Math.abs(col-c)==Math.abs(row-r))
				return false;
		}
		return true;
	}
	static boolean calc(int r){
		if(r==8)
			return true;
		for(int c=0;c<8;++c){
			if(can(r,c)){
				at[r]=c;
				if(calc(r+1))
					return true;
			}
		}
		return false;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		g=new String[8];
		for(int i=0;i<8;++i)
			g[i]=in.next();
		at=new int[8];
		if(calc(0)){
			System.out.println("YES");
			for(int i=0;i<8;++i){
				for(int j=0;j<8;++j){
					if(at[i]==j)
						System.out.print("Q");
					else
						System.out.print(g[i].charAt(j));
				}
				System.out.println("");
			}
		}else
			System.out.println("NO");
	}
}
