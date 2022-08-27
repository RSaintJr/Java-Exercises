import java.util.Scanner;


public class Exec11 {

	public static void main(String[] args) {
		
		Scanner pesoI = new Scanner(System.in);
		System.out.print("Informe a sua altura: ");
		float num1 = pesoI.nextFloat();
		System.out.println("Peso Ideal: " + (72.7 * num1 - 58));
		pesoI.close();

	}

}
