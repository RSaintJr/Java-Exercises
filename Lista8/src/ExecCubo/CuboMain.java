public class CuboMain {

    public static void main(String[] args){

        double a = 107.45;
        double rendimento = 12.5;
        double nivel = 2;

        Cubo calc = new Cubo(a,rendimento,nivel);

        calc.setAreaQuadrado();
        System.out.println("Área da Base: " + calc.getAreaQuadrado());
        calc.setDiagonalCubo();
        System.out.println("Diagonal do Cubo: " + calc.getDiagonalCubo());
        calc.setVolumeCubo();
        System.out.println("Volume do Cubo: " + calc.getVolumeCubo());
        calc.setAreaTotal();
        System.out.println("Área Total: " + calc.getAreaTotal());
        calc.Latinha();
        System.out.println("Litros de Tinta: " + calc.Latinha());
        calc.Latao();
        System.out.println("Latas de Tinta: " + calc.Latao());
        calc.preco();
        System.out.println("Valor Total: " + calc.preco());
    }
}
