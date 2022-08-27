import java.util.Scanner;

public class Exec5 {
	
	public static void main(String[] args) {
		
		Scanner convert = new Scanner(System.in);
		System.out.print("Conversão :");
		int metro = convert.nextInt();
		System.out.println("Centimetros: " + (metro * 100));
		
		convert.close();
		
	}

}
