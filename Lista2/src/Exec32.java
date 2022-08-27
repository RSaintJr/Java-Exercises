import java.util.Scanner;

public class Exec32 {

	public static void main(String[] args) {
		
		Scanner carne = new Scanner(System.in);
		System.out.print("Informe o tipo de carne se vai usar o cartão tabajara ou não e a quantidade de kg: ");
		char tipo = carne.next().charAt(0);
		char taba = carne.next().charAt(0);
		double valor = 4.90;
		double valor2 = 5.90;
		double valor3 = 6.90;
		
		if(tipo == 'F')
		{
			int carne2 = carne.nextInt();
			
			if(carne2 > 5)
			{
				valor = 5.80;
			}
			
			valor = valor * carne2;
			
			if(taba == 'S')
			{
				System.out.println("Preço a pagar: " + (valor - (((valor * 5) / 100))));
			}
			else
			{
				System.out.println("Preço a pagar: " + valor);
			}
		}
		else
		{
			if(tipo == 'A')
			{
				int carne2 = carne.nextInt();
				
				if(carne2 > 5)
				{
					valor2 = 6.80;
				}
				
				valor = valor2 * carne2;
				
				if(taba == 'S')
				{
					System.out.println("Preço a pagar: " + (valor2 - (((valor2 * 5) / 100))));
				}
				else
				{
					System.out.println("Preço a pagar: " + valor2);
				}
			}
			else
			{
				if(tipo == 'P')
				{
					int carne2 = carne.nextInt();
					
					if(carne2 > 5)
					{
						valor3 = 7.80;
					}
					
					valor = valor3 * carne2;
					
					if(taba == 'S')
					{
						System.out.println("Preço a pagar: " + (valor3 - (((valor3 * 5) / 100))));
					}
					else
					{
						System.out.println("Preço a pagar: " + valor3);
					}
				}
			}
		}
		
		carne.close();
	}

}
