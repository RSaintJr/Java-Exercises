import java.util.Scanner;

public class Exec9 {

	public static void main(String[] args) {
		
		
		Scanner faren = new Scanner(System.in);
		System.out.print("Informe a Temperatura em Fahrenheit: ");
		float temp = faren.nextFloat();
		System.out.println("Temperatura em celsius: " + (5 * (temp - 32) / 9));
		
		faren.close();
	}

}
