import java.util.Scanner;

public class Exec16 {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		System.out.print("Informe as notas: ");
		int num = nota.nextInt();
		int num2 = nota.nextInt();
		if((num + num2) / 2 <= 3)
		{
			System.out.println("Reprovado");
		}
		else
		{
			if((num + num2) / 2 <= 6.9)
			{
				System.out.println("Em Exame");
			}
			else
			{
				if((num + num2) / 2 <= 10)
				{
					System.out.println("Aprovado");
				}
			}
		}
		
		nota.close();

	}

}
