import java.util.Scanner;

public class Exec14 {

	public static void main(String[] args) {
		
		Scanner semana = new Scanner(System.in);
		System.out.print("Informe o numero correspondente ao dia da semana: ");
		int num = semana.nextInt();
		if(num == 1)
		{
			System.out.println("Domingo !");
		}
		else
		{
			if(num == 2)
			{
				System.out.println("Segunda-Feira !");
			}
			else
			{
				if(num == 3)
				{
					System.out.println("Terça-Feira !");
				}
				else
				{
					if(num == 4)
					{
						System.out.println("Quarta-Feira !");
					}
					else
					{
							if(num == 5)
							{
								System.out.println("Quinta-Feira !");
							}
							else
							{
								if(num == 6)
								{
									System.out.println("Sexta-Feira !");
								}
								else
								{
									if(num == 7)
									{
										System.out.println("Sabado !");
									}
									else
									{
										if(num > 7)
										{
											System.out.println("Invalido !");
										}
									}
								}
							}
					}
				}
			}
		}
		
		
		semana.close();

	}

}
