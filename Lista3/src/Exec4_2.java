// Segunda versão do exercício 4.

import java.util.Scanner;

public class Exec4_2 {

	public static void main(String[] args) {
		
		Scanner pop = new Scanner(System.in);
		
		System.out.println("Informe os dados Populacionais: ");
		int pais1 = pop.nextInt();
		double pais2 = pop.nextDouble();
		int i = 0;
		boolean z = false;
		char rep;
		
		while(z == false)
		{
			pais1 = pais1 + (pais1 * 3) / 100;
			pais2 = pais2 + (Math.round(pais2 * 1.5)) / 100;
			i++;
			
			if (pais1 > pais2)
			{
				System.out.println("População 1 e 2: " + pais1 + " " + pais2);
				System.out.println("Anos: " + i);
				System.out.println("Deseja repetir ?");
				rep = pop.next().charAt(0);
				
				if (rep == 's')
				{
					System.out.println("informe os dados populacionais denovo");
					
					pais1 = pop.nextInt();
					pais2 = pop.nextDouble();
				}
				else
				{
					z = true;
				}
			}
		}
		System.out.println("Finalizado");
		
		pop.close();
		
	}

}
