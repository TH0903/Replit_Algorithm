import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner Sc = new Scanner(System.in);
	    int inputN = Sc.nextInt();
	    int objectN = Sc.nextInt();
	    
	    int[] Arr = new int[inputN];
	    
	    for(int i=0;i<inputN;i++){
	        Arr[i] = Sc.nextInt();
	    }
	    
	    int BlackJack = Search(Arr,inputN,objectN);
	    System.out.println(BlackJack);
	    
	}
	
	public static int Search(int[] Arr, int inputN, int objectN){
	    int Result = 0;
	    
	    for(int i=0;i<inputN-2;i++){
	        for(int j=i+1;j<inputN;j++){
	            for(int k=j+1;k<inputN;k++){
	                int Calc = Arr[i] + Arr[j] + Arr[k];
	                
	                if(Calc == objectN){
	                    return Calc;
	                }
	                
	                if(Result<Calc && Calc<=objectN){
	                    Result = Calc;
	                }
	            }
	        }
	    }
	    
	    return Result;
	}
}