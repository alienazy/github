import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static String line;
	static StringTokenizer st;
	static BufferedReader br;
        static Scanner in;
        static char mrk;
    static String readnext()  throws java.lang.Exception{
		while (st == null || !st.hasMoreElements())
            st = new StringTokenizer(br.readLine());
        return (st.nextToken());
	}
    static int R,C;
    static char[][] g;
    static boolean [][] v;
    static int maxl;
   static int [] dr={-1,0,1,0};
    static int [] dc={0,1,0,-1};
     static void calc(int r,int c ){
         if (g[r][c]!='X'){
            v[r][c]=true;
          g[r][c]=mrk;
           for (int i=0;i<4;i++){
             int rn=r+dr[i];
             int cn=c+dc[i];
              if (rn<0 || cn<0 || rn==R || cn==C || g[rn][cn]=='X' ||g[rn][cn]==mrk || v[rn][cn])
                  continue;
              calc (rn,cn);
             }
           
         }
             
         }
         
         
         
     
     
    public static void main(String[] args) throws Exception {
		
		 //Scanner s=new Scanner(System.in);
      	//Scanner in = new Scanner (new File ("in.txt"));
                //Scanner in = new Scanner (System.in);
                         
            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           // BufferedReader br = new BufferedReader(new FileReader("in.txt"));
          //StringTokenizer st = new StringTokenizer(br.readLine());
       //Scanner s = new Scanner (new File ("in.txt"));
        //br = new BufferedReader(new InputStreamReader(System.in));
         in = new Scanner (new FileReader("in.txt"));
              //StringTokenizer st=new StringTokenizer(br.readLine());
            
            ArrayList <String>l =new ArrayList<String>();
            ArrayList <Integer>p =new ArrayList<Integer>();
            int maxc=0;
            int c=0;
            String ln="";
             String vn="";
            int cl=0;
              int pl=0;
 while (in.hasNext()){
     ln=in.nextLine();
   vn=ln;
     if (ln.charAt(0)=='_'){
         p.add(c);
         cl++;}
     else{
           l.add(ln);
           if (maxc<l.get(c).length()) maxc=l.get(c).length();
            c++;
               }
 }
  R=l.size();
 C=maxc;
  g=new char[R][C];
            v=new boolean[R][C];
            
            
            
             for (int i=0;i<R;i++){
                 for (int j=0;j<l.get(i).length();j++){
                     
                 g[i][j]=l.get(i).charAt(j);
                     }
              }
             
             
             
                 int b=0,w=0;
                for (int i=0;i<R;i++){
                 for (int j=0;j<l.get(i).length();j++){
                 // System.out.print(g[i][j]);
                      if (g[i][j]!=' ' && g[i][j]!='X'){
                          mrk=g[i][j];
                        calc(i,j);
                       // mrk=' ';
                       // g[i][j]=mrk;
                      }
                   
                    }
              }
              int x=0;
                   for (int i=0;i<R;i++){
                       
                 for (int j=0;j<l.get(i).length();j++){
                  System.out.print(g[i][j]);
                     }
                    System.out.println();
                    if (i==p.get(x)-1){
                        System.out.println(vn);
                        x++;
                    }
             }
                   
               
                             
                             
              
            
            
        
        
        //-----------------------------------------------------------------------
     }
}