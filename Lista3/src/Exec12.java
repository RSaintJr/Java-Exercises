import java.util.Scanner;

public class Exec12 {


		
		
		 static long fibo(int n) {
		        int F = 0;     // atual
		        int ant = 0;   // anterior

		        for (int i = 1; i <= n; i++) {

		            if (i == 1) {
		                F = 1;
		                ant = 0;
		            } else {
		                F += ant;
		                ant = F - ant;
		            }

		        }

		        return F;
		    }

		    public static void main(String[] args) {
		    	

				Scanner num = new Scanner(System.in);
				int numb = num.nextInt();
				
		        for (int i = 0; i < numb; i++) 
		        {
		            System.out.print("(" + i + "):" + Exec12.fibo(i) + "\t");
		        }
		        
		        num.close();

		    }
	}


