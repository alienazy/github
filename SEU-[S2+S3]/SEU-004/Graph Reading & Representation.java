// Reading graphs + Graph representation
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<ArrayList<Integer> > g=new ArrayList<ArrayList<Integer> >();
		int n=Integer.parseInt(in.readLine());
		for(int i=0;i<n;++i)
			g.add(new ArrayList<Integer>());
		int m=Integer.parseInt(in.readLine());
		for(int k=0;k<m;++k){
			String line=in.readLine();
			StringTokenizer st=new StringTokenizer(line);
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			--x;--y;
			g.get(x).add(y);
			g.get(y).add(x);
			
			System.out.println("---------------------");
			for(int i=0;i<n;++i){
				System.out.print("Node "+i+": ");
				for(int j=0;j<g.get(i).size();++j)
					System.out.print(g.get(i).get(j)+" ");
				System.out.println("");
			}
			System.out.println("---------------------");
		}
	}
}
