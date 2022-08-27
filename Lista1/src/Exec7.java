import java.util.Scanner;

public class Exec7 {

	public static void main(String[] args) {
		
		Scanner area = new Scanner(System.in);
		System.out.print("Informe um número (int):");
		float are1 = area.nextFloat();
		System.out.println("Area do Quadrado: " + (are1 * 4));
		
		area.close();
	}
}
