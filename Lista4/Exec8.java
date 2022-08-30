//incompleto

import java.util.Random;
import java.util.Scanner;
// 1,5,9,15,21
public class Exec8 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        char alfabeto[] = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char vogal[] = "aeiou".toCharArray();

        int tamanho = entrada.nextInt();
        Random letra = new Random(vogal.length);

        if (tamanho > 26)
        {
            while (tamanho > 26)
            {
                System.out.println("Tamanho Invalido !");
                tamanho = entrada.nextInt();
            }
        }

        StringBuilder senha = new StringBuilder();

        for (int i = 1; i <= tamanho; i++)
        {
            int k = letra.nextInt(vogal.length);
            if (tamanho == 1)
            {
                senha.append(alfabeto[i]);
            }

            if (alfabeto[i] != 'a' || alfabeto[i] != 'e'|| alfabeto[i] != 'i'|| alfabeto[i] != 'o' || alfabeto[i] != 'u')
            {

                senha.append(vogal[k]);
            }
            else
            {
                senha.append(alfabeto[i]);
            }

        }

        System.out.println(senha);


    }
}
