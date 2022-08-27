import java.util.Scanner;

public class Exec13 {

	public static void main(String[] args) {
		

		Scanner pesoP = new Scanner(System.in);
		System.out.print("Informe o Peso do Peixe: ");
		float peixe = pesoP.nextFloat();
		float excesso = peixe - 50;
		float multa = excesso * 4;
		System.out.println("Multa: " + multa);
		pesoP.close();

	}

}
