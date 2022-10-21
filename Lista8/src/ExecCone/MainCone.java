package ExecCone;

public class MainCone {

    public static void main(String[] args){

        double raio = 3.5;
        double altura = 9;
        double nivel = 2;

        Cone calc = new Cone(altura,raio,nivel);

        calc.setGeratriz();
        System.out.println("Geratriz: " + calc.getGeratriz());
        calc.setAreaCirculo();
        System.out.println("Area do Circulo: " + calc.getAreaCirculo());
        calc.setAreaLateral();
        System.out.println("Area da Lateral: " + calc.getAreaLateral());
        calc.setAreaTotal();
        System.out.println("Area Total: " + calc.getAreaTotal());
        System.out.println("Litros: " + calc.Litrin());
        System.out.println("Latas: " + calc.Litrao());
        System.out.println("Preço Total: " + calc.Preco());

    }
}
