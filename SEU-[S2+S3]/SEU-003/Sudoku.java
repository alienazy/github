// Sudoku

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	static int[][] g;
	static boolean calc(int r,int c){
		if(c==9)
			return calc(r+1,0);
		if(r==9)
			return true;
		if(g[r][c]!=0)
			return calc(r,c+1);
		for(int d=1;d<=9;++d){
			if(can(r,c,d)){
				g[r][c]=d;
				if(calc(r,c+1))
					return true;
				g[r][c]=0;
			}
		}
		return false;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
	}
}
