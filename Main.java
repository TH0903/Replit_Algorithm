import java.util.*;

public class Main
{
    static char[][] Chess;
    
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int inputHeight = Sc.nextInt();
		int inputWidth = Sc.nextInt();
		int Ans = 1000000;
		Chess = new char[inputHeight][inputWidth];
		
		for(int i=0;i<inputHeight;i++){
		    String inputMap = Sc.next();
		    for(int j=0;j<inputWidth;j++){
		     Chess[i][j] = inputMap.charAt(j);
		    }
		}
		
		int N_inputHeight = inputHeight-7;
		int N_inputWidth = inputWidth-7;
		
		for(int i=0;i<N_inputHeight;i++)
		    for(int j=0;j<N_inputWidth;j++){
		        Ans = Math.min(Ans,find(i,j));
		    }
		    System.out.println(Ans);
 		}
 		
 	public static int find(int input_inputHeight, int input_inputWidth){
 	    int Black = 0;
 	    int White = 0;
 	    
 	    int End_inputHeight = input_inputHeight+8;
 	    int End_inputWidth = input_inputWidth+8;
 	    
 	    for(int i=input_inputHeight;i<End_inputHeight;i++){
 	        for(int j=input_inputWidth;j<End_inputWidth;j++){
 	            if((i+j)%2 == 0){
 	                if(Chess[i][j] == 'B'){White++;}
 	                else{Black++;}
 	            }
 	            
 	            else{
 	                if(Chess[i][j] == 'W'){White++;}
 	                else{Black++;}
 	            }
 	            
 	        }
 	    }
 	    
 	    return Math.min(Black,White);
 	    
 	}
	
}
