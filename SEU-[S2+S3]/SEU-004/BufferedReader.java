// BufferedReader

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//Scanner in=new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// n
		// x y
		// x y
		String line=in.readLine();
		int n=Integer.parseInt(line);
		for(int i=0;i<n;++i){
			line=in.readLine();
			StringTokenizer st=new StringTokenizer(line," ");
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
		}
	}
}
