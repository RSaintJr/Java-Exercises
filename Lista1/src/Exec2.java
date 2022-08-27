import java.util.Scanner;

public class Exec2 {

	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);
		System.out.print("Informe um número (int):");
		int numero = num.nextInt();
		System.out.println("Numero Informado: " + numero );
		
		num.close();
		
	}
}
