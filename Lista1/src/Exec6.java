import java.util.Scanner;

public class Exec6 {

	public static void main(String[] args) {
	
		Scanner area = new Scanner(System.in);
		System.out.print("Informe o raio do circulo:");
		double circulo = area.nextDouble();
		double are2 = ((circulo * circulo)* 3.14)  ;
		System.out.println("Area: " + are2);
		
		area.close();
	}

}
