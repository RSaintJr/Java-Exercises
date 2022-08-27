import java.util.Scanner;

public class Exec10 {

	public static void main(String[] args) {
	
		Scanner numero = new Scanner(System.in);
		System.out.print("Informe os tres numeros: ");
		int num1 = numero.nextInt();
		int num2 = numero.nextInt();
		float num3 = numero.nextFloat();
		System.out.println("Produto: " + (num1 * 2)*(num2 / 2));
		System.out.println("Soma: " + (num1 * 3 + num3) );
		System.out.println("Cubo: " + (num3 * num3 * num3 ));
		
		numero.close();
		
	}
}
