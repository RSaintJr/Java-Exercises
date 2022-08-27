import java.util.Scanner;

public class Exec15 {

	public static void main(String[] args) {
		

		Scanner export = new Scanner(System.in);
		System.out.print("Informe o preço de custo e o código de origem: ");
		float preco = export.nextFloat();
		int num = export.nextInt();
		if(num == 1)
		{
			System.out.println("Sul ! " + "Preço: " + preco);
		}
		else
		{
			if(num == 2)
			{
				System.out.println("Norte ! " + "Preço: " + preco);
			}
			else
			{
				if(num == 3)
				{
					System.out.println("Leste ! " + "Preço: " + preco);
				}
				else
				{
					if(num == 4)
					{
						System.out.println("Oeste ! " + "Preço: " + preco);
					}
					else
					{
							if(num == 5 || num == 6)
							{
								System.out.println("Nordeste ! " + "Preço: " + preco);
							}
							else
							{
								if(num == 7 || num == 8)
								{
									System.out.println("Centro-Oeste ! " + "Preço: " + preco);
								}
								else
								{
									if(num > 8)
									{
										System.out.println("Importado ! " + "Preço: " + preco);
									}
								}
										
							}
					}
				}
			}
		}
			
		
		
		export.close();
	}

}
