import java.util.Scanner;

public class Exec18 {

	public static void main(String[] args) {
		
		Scanner triangulo = new Scanner(System.in);
		System.out.print("Informe os lados do triângulo: ");
		float lado1 = triangulo.nextFloat();
		float lado2 = triangulo.nextFloat();
		float lado3 = triangulo.nextFloat();
		if(lado1 == lado2 && lado2 == lado3)
		{
			System.out.println("Triângulo Equilatero");
		}
		else
		{
			if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1)
			{
				System.out.println("Triângulo Escaleno");
			}
			else
			{	
				System.out.println("Triângulo Isósceles");
			}
		}
		
		triangulo.close();

	}

}
