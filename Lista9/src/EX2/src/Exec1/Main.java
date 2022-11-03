package Exec1;

public class Main {
    public static void main(String[] args) {

        Veiculo v = new Veiculo();
        System.out.println(v);

        Moto v1 = new Moto();
        v1.setCilindradas(8998);
        System.out.println(v1);

        Carro v2 = new Carro();
        v2.setPortas(4);
        System.out.println(v2);

        Caminhao v3 = new Caminhao();
        v3.setEixos(8);
        System.out.println(v3);
    }
}