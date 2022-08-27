import java.util.Scanner;

public class Exec9 {

	public static void main(String[] args) {
		
		Scanner pesin = new Scanner(System.in);
		System.out.print("Informe o gênero em uma letra(ex: F ou M), o seu peso e por ultimo a sua altura: ");
		float genero = pesin.next().charAt(0);
		float p = pesin.nextFloat();
		float alt = pesin.nextFloat();
		if(genero == 'F')
		{
			System.out.println("Peso Ideal: " + ((alt * 62.1) - 44.7));
			System.out.println("Dados: " + genero + " " + p + " " + alt);
			if((alt * 62.1) - 44.7 > p)
			{
				System.out.println("Abaixo do peso ideal");
			}
			else
			{
				System.out.println("Acima do peso ideal");
			}
		}
		if(genero == 'M')
		{
			System.out.println("Peso Ideal: " + ((alt * 72.7) - 58));
			System.out.println("Dados: " + genero + " " + p + " " + alt);
			if((alt * 72.7) - 58 > p)
			{
				System.out.println("Abaixo do peso ideal");
			}
			else
			{
				System.out.println("Acima do peso ideal");
			}
		}
		
		pesin.close();
	}

}
