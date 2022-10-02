import java.io.*;

public class P2247
{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine());
		String[][] StarBulid = new String[N][N];
    for(int i=0;i<StarBulid.length;i++){
      for(int j=0;j<StarBulid[0].length;j++){
        StarBulid[i][j] = " ";
      }
    }
    Star(StarBulid,0,0,N);

    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){
      bw.write(StarBulid[i][j]);
        }
      bw.write("\n");
    }

    bw.flush(); 
    bw.close();


    
	}

  public static void Star(String Str[][],int x, int y, int N){
  if(N == 1){
    Str[x][y] = "*";
    return;
  }

    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        if(i != 1 || j != 1){
          Star(Str,x+(N/3)*i,y+(N/3)*j,N/3);
        }
      }
    }   
  }
}




	
