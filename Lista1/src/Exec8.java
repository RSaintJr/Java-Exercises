import java.util.Scanner;

public class Exec8 {

	public static void main(String[] args) {
		
		Scanner hora = new Scanner(System.in);
		System.out.print("Informe a quantia ganha por horas trabalhadas: ");
		float trab1 = hora.nextFloat();
		System.out.print("Informe as horas trabalhadas no mês: ");
		float traba = hora.nextFloat();
		System.out.println("Salário: " + (trab1 * traba));
		
		hora.close();
	}

}
