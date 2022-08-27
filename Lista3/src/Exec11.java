import java.util.Scanner;

public class Exec11 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		
		int n = 0;
		int k = 0;
		int j = 0;
		
		for (int i = 0; i < 10; i++)
		{
			n = num.nextInt();
			
			if (n % 2 == 1)
			{
				k++;
			}
			else
			{
				j++;
			}
		}
		
		System.out.println("Impares: " + k);
		System.out.println("Pares: " + j);
		
		num.close();
		
		
	}

}
