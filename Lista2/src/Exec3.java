import java.util.Scanner;

public class Exec3 {

	public static void main(String[] args) {
		
		Scanner gen = new Scanner(System.in);
		System.out.print("Informe o gênero em uma letra(ex: F ou M): ");
		char genero = gen.next().charAt(0);
		if(genero == 'F')
		{
			System.out.println("F-Feminino");
		}
		if(genero == 'M')
		{
			System.out.println("M-Masculino");
		}
		gen.close();

	}

}
