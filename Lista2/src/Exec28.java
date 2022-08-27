import java.util.Scanner;

public class Exec28 {

	public static void main(String[] args) {
	
		Scanner opera = new Scanner(System.in);
		System.out.println("Digite o número: ");
		float num = opera.nextFloat();
		int num2 = opera.nextInt();
		
		if(num2 == 1)
		{
			if(num % 2 == 1)
			{
				System.out.println("Impar !");
			}
			else
			{
				System.out.println("Par");
			}
		}
		else
		{
			if(num2 == 2)
			{
				if(num < 0)
				{
					System.out.println("Negativo");
				}
				else
				{
					System.out.println("Positivo");
				}
			}
			else
			{
				if(Math.round(num) < num || Math.round(num) > num)
				{
					System.out.println("Decimal");
				}
				else
				{
					System.out.println("Inteiro");
				}
			}
			
		}
		
		opera.close();
	}

}
