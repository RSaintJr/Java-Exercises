import java.util.Scanner;

public class Exec13 {

	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in);
		System.out.print("Informe a quantia ganha por horas trabalhadas: ");
		float trab1 = salario.nextFloat();
		System.out.print("Informe as horas trabalhadas no mês: ");
		float trabH = salario.nextFloat();
		float sal = (trab1 * trabH);
		float inss = (sal * 10) / 100;
		float sindi = (sal * 3) / 100;
		float fg = (sal * 11) / 100;
		if(sal <= 900)
		{
			System.out.println("Salário bruto: " + sal);
			System.out.println("Sindicato: " + sindi);
			System.out.println("INSS: " + inss);
			System.out.println("FGTS: " + fg);
			System.out.println("Total de descontos: " + inss);
			System.out.println("Salário Liquido: " + (sal - inss));
		}
		else
		{
			if(sal <= 1500)
			{
				System.out.println("Salário bruto: " + sal);
				System.out.println("Sindicato: " + sindi);
				System.out.println("Imposto de Renda: " + (sal * 5) / 100);
				System.out.println("INSS: " + inss);
				System.out.println("FGTS: " + fg);
				System.out.println("Total de descontos: " + ((sal * 5) / 100 + inss));
				System.out.println("Salário Liquido: " +  (sal - (sal * 5 / 100) - inss));
			}
			else
			{
				if(sal <= 2500)
				{
					System.out.println("Salário bruto: " + sal);
					System.out.println("Sindicato: " + sindi);
					System.out.println("Imposto de Renda: " + (sal * 10) / 100);
					System.out.println("INSS: " + inss);
					System.out.println("FGTS: " + fg);
					System.out.println("Total de descontos: " + ((sal * 10) / 100 + inss));
					System.out.println("Salário Liquido: " +  (sal - (sal * 10 / 100) - inss));
				}
				else
				{
					if(sal > 2500)
					{
						System.out.println("Salário bruto: " + sal);
						System.out.println("Sindicato: " + sindi);
						System.out.println("Imposto de Renda: " + (sal * 20) / 100);
						System.out.println("INSS: " + inss);
						System.out.println("FGTS: " + fg);
						System.out.println("Total de descontos: " + ((sal * 20) / 100 + inss));
						System.out.println("Salário Liquido: " +  (sal - (sal * 20 / 100) - inss));
					}
				}
			}
		}
		
		salario.close();
		
		
		

	}

}
