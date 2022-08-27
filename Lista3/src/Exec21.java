import java.util.Scanner;

public class Exec21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int id = 0;
		int j = 0;
		int k = 0;
		
		for (int i = 0; i < n; i++)
		{
			j = entrada.nextInt();
			id = id + j;
			k++;
		}
		
		if (id / k <= 25)
		{
			System.out.println("Turma Jovem");
		}
		else if (id / k <= 60)
		{
			System.out.println("Turma Adulta");
		}
		else if (id / k > 60)
		{
			System.out.println("Turma Idosa");
		}
		
		
		entrada.close();
		
	}

}
