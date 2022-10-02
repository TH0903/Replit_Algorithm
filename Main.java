import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int input = Sc.nextInt();
		int Result = Calc(input);
		System.out.println(Result);
		
	}
	
	public static int Calc(int input){
	    for(int i=0;i<input;i++){
	        int Sum = 0;
	        int Count = i;
	        
	        while(Count != 0){
	            Sum += Count%10;
	            Count = Count/10;
	        }
	        
	        if(Sum+i == input){
	            return i;
	        }
	        
	        
	    }
	    
	    return 0;
	    
	}
}