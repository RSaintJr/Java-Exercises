import java.util.Scanner;

public class Exec17 {

	public static void main(String[] args) {
	
		Scanner nota = new Scanner(System.in);
		System.out.print("Informe as notas: ");
		int num = nota.nextInt();
		int num2 = nota.nextInt();
		if((num + num2) / 2 <= 4)
		{
			System.out.println("Notas: " + num + ", " + num2);
			System.out.println("Reprovado");
			System.out.println("Conceito: E");
		}
		else
		{
			if((num + num2) / 2 <= 6)
			{
				System.out.println("Notas: " + num + ", " + num2);
				System.out.println("Reprovado");
				System.out.println("Conceito: D");
			}
			else
			{
				if((num + num2) / 2 <= 7.5)
				{
					System.out.println("Notas: " + num + ", " + num2);
					System.out.println("Aprovado");
					System.out.println("Conceito: C");
				}
				else
				{
					if((num + num2) / 2 <= 9)
					{
						System.out.println("Notas: " + num + ", " + num2);
						System.out.println("Aprovado");
						System.out.println("Conceito: B");
					}
					else
					{
						if((num + num2) / 2 <= 7.5)
						{
							System.out.println("Notas: " + num + ", " + num2);
							System.out.println("Aprovado");
							System.out.println("Conceito: A");
						}

					}

				}
			}
		}
		
		nota.close();
	}

}
