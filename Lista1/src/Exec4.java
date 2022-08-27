import java.util.Scanner;

public class Exec4 {

	public static void main(String[] args) {
		
		Scanner exec4 = new Scanner(System.in);
		System.out.print("Informe as notas :");
		double nota1 = exec4.nextDouble();
		double nota2 = exec4.nextDouble();
		double nota3 = exec4.nextDouble();
		double nota4 = exec4.nextDouble();
		System.out.println("Media: " + (nota1 + nota2 + nota3 + nota4)/4 );
		
		exec4.close();

	}

}
