import java.util.Scanner;

public class Exec33 {

	public static void main(String[] args) {
	
		Scanner crime = new Scanner(System.in);
		System.out.println("Informe o seu gabarito");
		System.out.println("  ");
		int i = 0;
		int n = 0;
		char resp;
		
		do
		{
			System.out.println("Q1");
			resp = crime.next().charAt(0);
			if(resp == 'A')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
			
			System.out.println("Q2");
			resp = crime.next().charAt(0);
			if(resp == 'A')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
			
			System.out.println("Q3");
			resp = crime.next().charAt(0);
			if(resp == 'B')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
			
			System.out.println("Q4");
			resp = crime.next().charAt(0);
			if(resp == 'B')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
				
			System.out.println("Q5");
			resp = crime.next().charAt(0);
			if(resp == 'C')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
			
			System.out.println("Q6");
			resp = crime.next().charAt(0);
			if(resp == 'C')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
			
			System.out.println("Q7");
			resp = crime.next().charAt(0);
			if(resp == 'D')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
			
			System.out.println("Q8");
			resp = crime.next().charAt(0);
			if(resp == 'D')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
			
			System.out.println("Q9");
			resp = crime.next().charAt(0);
			if(resp == 'E')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
			
			System.out.println("Q10");
			resp = crime.next().charAt(0);
			if(resp == 'E')
			{
				i++;
				n++;
			}
			else
			{
				n++;
			}
		}
		while(n < 10);
		
		System.out.println("Pontuação final: " + i);
		
		crime.close();
		
		
	

	}

}
