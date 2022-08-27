import java.util.Scanner;

public class Exec17 {
	
	
	static boolean isPrime(int n)
	    {
	       
	        if (n <= 1)
	            return false;
	  
	       
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return false;
	  
	        return true;
	    }
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		
		if(isPrime(n))
		{
			System.out.println("Primo");
		}
		else
		{
			System.out.println("Não é Primo! ");
		}
		
		entrada.close();
		
		 
		
		

	}

}
