import java.util.Scanner;

public class Exec11 {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe os nomes. ");
		
		String nomes = entrada.nextLine();
		
		String[] name = nomes.split(";");
		
		for(int i = 0; i < 3; i++)
		{
			System.out.print(name[i] + " ; ");
		}
			
		entrada.close();
	}

}
