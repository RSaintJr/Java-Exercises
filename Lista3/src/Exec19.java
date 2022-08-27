import java.util.Scanner;

public class Exec19 {

	 public static void main(String[] args) {    
		 
		 Scanner entrada = new Scanner(System.in);
		 
		 int n = entrada.nextInt();
		 
		 for (int i = 2; i <= n; i++)
		 {
			 if( ehPrimo(i) )
			 System.out.println(i + " é primo.");
		 }  
		 
		 entrada.close();
	 }
	 
		 
	 private static boolean ehPrimo(int numero) {
		 for (int j = 2; j < numero; j++) 
		 {
			if (numero % j == 0)
			return false;   
		 }
		  	return true;
		    
		  
		    }
	
	}