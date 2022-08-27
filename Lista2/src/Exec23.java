import java.util.Scanner;

public class Exec23 {

	public static void main(String[] args) {
	
		Scanner idade = new Scanner(System.in);
		System.out.println("Informe as idades: ");
		int idad1 = idade.nextInt();
		int idad2 = idade.nextInt();
		int idad3 = idade.nextInt();
		if((idad1 + idad2 + idad3) / 3 <= 25)
		{
			System.out.println("Turma Jovem");
		}
		else
		{
			if((idad1 + idad2 + idad3) / 3 <= 40)
			{
				System.out.println("Turma Adulta");
			}
			else
			{
				if((idad1 + idad2 + idad3) / 3 > 40)
				{
					System.out.println("Turma Idosa");
				}
			}
		}
		
		idade.close();
	}
}
