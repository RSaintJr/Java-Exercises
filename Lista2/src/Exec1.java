import java.util.Scanner;

public class Exec1 {

	public static void main(String[] args) {
		
		Scanner maior = new Scanner(System.in);
		System.out.print("Informe os números: ");
		int num1 = maior.nextInt();
		int num2 = maior.nextInt();
		if(num1 < num2)
		{
			System.out.println("Número Maior: " + num2);
		}
		else 
		{
			System.out.println("Número Maior: " + num1);
		}
		maior.close();
	}

}
