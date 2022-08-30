import java.util.Scanner;

public class Exec10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a data no modelo: dd/mm/aaaa. ");
		
		String data = entrada.nextLine();
		
		String[] date = data.split(";");
		
		for(int i = 0; i < 3; i++)
		{
			System.out.print(date[i] + "/");
		}
			
		entrada.close();
	}

}
