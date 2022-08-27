import java.util.Scanner;

public class Exec8 {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		System.out.print("Informe as notas: ");
		int num = nota.nextInt();
		int num2 = nota.nextInt();
		if((num + num2) / 2 >= 7)
		{
			System.out.println("Aprovado");
		}
		else
		{
			System.out.println("Reprovado");
		}
		nota.close();
	}

}
