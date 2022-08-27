import java.util.Scanner;

public class Exec25 {
	public static void main(String[] args) {
		
		Scanner caixa = new Scanner(System.in);
		System.out.println("Digite o valor que você deseja sacar");
		int dinheiro = caixa.nextInt();
		
		int hundred = 100;
		int fifty = 50;
		int ten = 10;
		int five = 5;
		int one = 1;

		if(hundred >= hundred) 
		{
			hundred = dinheiro / 100;
			dinheiro = dinheiro % 100;
			if (hundred != 0)
			System.out.println(hundred + " notas de R$ 100,00");
		}

		if(fifty >= fifty) 
		{
			fifty = dinheiro / 50;
			dinheiro = dinheiro % 50;
			if (fifty != 0)
			System.out.println(fifty + " notas de R$ 50,00");
		}

		if(ten >= ten)
		{
			ten = dinheiro / 10;
			dinheiro = dinheiro % 10;
			if (ten != 0)
			System.out.println(ten + " notas de R$ 10,00");
		}

		if(five >= five) 
		{
			five = dinheiro / 5;
			dinheiro = dinheiro % 5;
			if (five != 0)
			System.out.println(five + " notas de R$ 5,00");
		}

		if(one >= one) 
		{
			one = dinheiro / 1;
			dinheiro = dinheiro % 1;
			if (one != 0)
			System.out.println(one + " moedas de R$ 1,00");
		}
		
		caixa.close();
}
}