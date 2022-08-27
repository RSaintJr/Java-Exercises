import java.util.Scanner;

public class Exec24 {

	public static void main(String[] args) {
		
		Scanner media = new Scanner(System.in);
		System.out.println("Informe as notas: ");
		int nota1 = media.nextInt();
		int nota2 = media.nextInt();
		int nota3 = media.nextInt();
		if((nota1 + nota2 + nota3) / 3 < 7 )
		{
			System.out.println("Reprovado");
		}
		else
		{
			if((nota1 + nota2 + nota3) / 3 >= 7)
			{
				System.out.println("Aprovado");
			}
			else
			{
				if((nota1 + nota2 + nota3) / 3 == 10)
				{
					System.out.println("Aprovado com Distinção");
				}
			}
		}
		
		media.close();

	}

}
