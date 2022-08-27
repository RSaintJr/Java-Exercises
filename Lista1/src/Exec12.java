import java.util.Scanner;


public class Exec12 {
	
	public static void main(String[] args) {
		
		Scanner pesoI = new Scanner(System.in);
		System.out.print("Informe a sua altura: ");
		float num1 = pesoI.nextFloat();
		System.out.println("Peso Ideal Masculino: " + (72.7 * num1 - 58));
		System.out.println("Peso ideal Feminino: " + (62.1 * num1 - 44.7));
		pesoI.close();
		
	}
}
