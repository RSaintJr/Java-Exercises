import java.util.Scanner;
import java.lang.Math;

public class Exec4 {

	public static void main(String[] args) {
		
		Scanner anoB = new Scanner(System.in);
		System.out.print("Informe o ano em 4 digitos: ");
		int ano = anoB.nextInt();
		int ano1 = Math.floorMod(ano,4);
		if(ano1 > 0)
		{
			System.out.println("Não é bissexto ");
		}
		else
		{
			System.out.println("É bissexto ");
		}
		anoB.close();
	}

}
