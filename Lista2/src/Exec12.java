import java.util.Scanner;

public class Exec12 {

	public static void main(String[] args) {
		

		Scanner salario = new Scanner(System.in);
		System.out.print("Informe o salário: ");
		
		float sal = salario.nextFloat();
		
		if(sal <= 280)
		{
			System.out.println("Salário antes do Ajuste: " + sal);
			System.out.println("Percentual do aumento: 20%");
			System.out.println("Valor do aumento: " + ((sal * 20) / 100));
			System.out.println("Novo salário: " + ((sal * 20) / 100 + sal));
		}
		else
		{
			if(sal > 280 && sal <= 700)
			{
				System.out.println("Salário antes do Ajuste: " + sal);
				System.out.println("Percentual do aumento: 15%");
				System.out.println("Valor do aumento: " + ((sal * 15) / 100));
				System.out.println("Novo salário: " + ((sal * 15) / 100 + sal));
			}
			else
			{
				if(sal > 700 && sal <= 1500)
				{
					System.out.println("Salário antes do Ajuste: " + sal);
					System.out.println("Percentual do aumento: 10%");
					System.out.println("Valor do aumento: " + ((sal * 10) / 100));
					System.out.println("Novo salário: " + ((sal * 10) / 100 + sal));
				}
				else
				{
					if(sal > 1500)
					{
						System.out.println("Salário antes do Ajuste: " + sal);
						System.out.println("Percentual do aumento: 5%");
						System.out.println("Valor do aumento: " + ((sal * 5) / 100));
						System.out.println("Novo salário: " + ((sal * 5) / 100 + sal));
					}
				}
			}
		}
		
		salario.close();
	}

}
