import java.util.Scanner;

public class Exec14 {

	public static void main(String[] args) {
	
		Scanner salario = new Scanner(System.in);
		System.out.print("Informe a quantia ganha por horas trabalhadas: ");
		float trab1 = salario.nextFloat();
		System.out.print("Informe as horas trabalhadas no mês: ");
		float traba = salario.nextFloat();
		float salarioB = (trab1 * traba);
		float IR = (salarioB * 11) / 100;
		float inss = (salarioB * 8) / 100;
		float sindi = (salarioB * 5) / 100;
		float salarioL = (salarioB - IR - inss - sindi);
		System.out.println("Salário Bruto: " + salarioB);
		System.out.println("Desconto INSS: " + inss);
		System.out.println("Desconto Sindicato: " + sindi);
		System.out.println("Salário Liquido: " + salarioL);
		salario.close();
	}

}
