import java.util.Scanner;

public class Exec2 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.print("Informe o número: ");
		int num1 = num.nextInt();
		if(num1 != 0)
		{
			if(num1 > 0)
		{
			System.out.println("Valor Positivo");
		}
			if(num1 < 0)
			{
				System.out.println("Valor Negativo");
			}
		}
		else
		{
			System.out.println("Valor = 0");
		}
		num.close();
	}

}
