import java.util.Scanner;

public class Exec37_2 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        char[] gabarito = new char[10];

        int maior = 0;
        int menor = 1000;
        int acertos;
        int acertosG = 0;
        int k = 0;
        int saida;
        char resp;
        boolean fin = false;

        for (int i = 0; i < 10; i++)
        {
            resp = entrada.next().charAt(0);
            gabarito[i] = resp;
        }

        while (!fin)
        {
            k++;
            acertos = 0;

            for (int i = 0; i < 10; i++)
            {
                resp = entrada.next().charAt(0);

                if (resp == gabarito[i])
                {
                    acertos++;
                    acertosG++;
                }
            }

            if (acertos < menor)
            {
                menor = acertos;
            }

            if (acertos > maior)
            {
                maior = acertos;
            }

            System.out.println("Deseja encerrar o programa ? (0 - para encerrar, qualquer outro número para continuar)");
            saida = entrada.nextInt();

            if (saida == 0)
            {
                fin = true;
            }
        }

        System.out.println("Maior número de acertos: " + maior);
        System.out.println("Menor número de acertos: " + menor);
        System.out.println("Total de alunos que utilizaram o sistema: " + k);
        System.out.println("Média de notas da turma: " + acertosG / k);

        entrada.close();
    }
}
