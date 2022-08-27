import java.util.Scanner;

public class Exec3 {

	public static void main(String[] args) {
		
		
		Scanner valid = new Scanner(System.in);
		System.out.println("Escreva seus dados: ");
		String nome = valid.nextLine();
		int idade = valid.nextInt();
		float salario = valid.nextFloat();
		char sexo = valid.next().charAt(0);
		char civil = valid.next().charAt(0);
		boolean valido = false;
		
		while(valido == false)
		{
			if(nome.length() < 3)
			{
				System.out.println("Escreva um nome maior !");
				nome = valid.nextLine();
			}
			else if(idade <= 0 || idade >= 150)
			{
				System.out.println("Idade Invalida !");
				idade = valid.nextInt();
			}
			else if(salario <= 0)
			{
				System.out.println("Salário Invalido !");
				salario = valid.nextFloat();
			}
			else if(sexo != 'f' && sexo != 'm')
			{
				System.out.println("Genero invalido !");
				sexo = valid.next().charAt(0);
			}
			else if(civil != 's' && civil != 'c' && civil != 'v' && civil != 'd')
			{
				System.out.println("Estado civil Invalido !");
				civil = valid.next().charAt(0);
			}
			else
			{
				valido = true;
			}
			
			
		}
		
		
		
		valid.close();
	}

}
