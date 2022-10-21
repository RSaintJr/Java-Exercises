public class Cubo {

    private final double tipo1 = 101.90;
    private final double tipo2 = 212.45;
    private final double tipo3 = 345.56;
    private final double lata = 18;
    private double areaQuadrado;
    private double volumeCubo;
    private double diagonalCubo;
    private double areaTotal;
    private double a;
    private double rendimento;
    private double nivel;

    public Cubo(double a, double rendimento, double nivel) {
        this.a = a;
        this.rendimento = rendimento;
        this.nivel = nivel;
    }

    public double Latinha(){
        return areaTotal / rendimento;
    }

    public double Latao(){
        return Math.round(Latinha() / 18);
    }

    public double preco(){
        if (nivel == 1){
            return Latao() * tipo1;
        } else if (nivel == 2) {
            return Latao() * tipo2;
        }
        else {
            return Latao() * tipo3;
        }
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado() {
        this.areaQuadrado = a * a;
    }

    public double getVolumeCubo() {
        return volumeCubo;
    }

    public void setVolumeCubo() {
        this.volumeCubo = (a * a * a);
    }

    public double getDiagonalCubo() {
        return diagonalCubo;
    }

    public void setDiagonalCubo() {
        this.diagonalCubo = a * Math.sqrt(3);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public double getNivel() {
        return nivel;
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal() {
        this.areaTotal = areaQuadrado + volumeCubo + diagonalCubo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cubo{");
        sb.append("tipo1 =").append(tipo1);
        sb.append(", tipo2 =").append(tipo2);
        sb.append(", tipo3 =").append(tipo3);
        sb.append(", lata =").append(lata);
        sb.append(", areaQuadrado =").append(areaQuadrado);
        sb.append(", volumeCubo =").append(volumeCubo);
        sb.append(", diagonalCubo =").append(diagonalCubo);
        sb.append(", a =").append(a);
        sb.append(", rendimento =").append(rendimento);
        sb.append(", nivel =").append(nivel);
        sb.append('}');
        return sb.toString();
    }

}