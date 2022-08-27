import java.util.Scanner;

public class Exec3 {
	
	public static void main(String[] args) {
		
		Scanner exec3 = new Scanner(System.in);
		System.out.print("Informe um número (int):");
		int num1 = exec3.nextInt();
		int num2 = exec3.nextInt();
		System.out.println("Soma: " + (num1 + num2) );
		
		exec3.close();
	}

}
