public class PiramideMain {

    public static void main(String[] args)
    {
        double ab = 3.56;
        double h = 23.18;
        double nivel = 1;

        Piramide calc = new Piramide(ab,h,nivel);

        calc.setAreaBase();
        System.out.println("Área base da Pirâmide: " + calc.getAreaBase());
        calc.setVolumePiramide();
        System.out.println("Volume da Pirâmide: " + calc.getVolumePiramide());
        calc.setAreaTriangulo();
        System.out.println("Área da Pirâmide: " + calc.getAreaTriangulo());
        calc.setAreaTotal();
        System.out.println("Área Total: " + calc.getAreaTotal());
        System.out.println("Litros: " + calc.Latinha());
        System.out.println("Latas: " + calc.Latao());
        System.out.println("Preço: " + calc.preco());
    }
}
