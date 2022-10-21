public class Piramide {

    private final double tipo1 = 127.90;
    private final double tipo2 = 258.98;
    private final double tipo3 = 344.34;
    private final double rendimento = 4.76;
    private final double lata = 18;
    private double ab;
    private double h;
    private double nivel;
    private double volumePiramide;
    private double areaBase;
    private double areaTriangulo;
    private double areaTotal;

    public Piramide(double ab, double h, double nivel) {
        this.ab = ab;
        this.h = h;
        this.nivel = nivel;
    }

    public double Latinha(){
        return areaTotal * rendimento;
    }

    public double Latao(){
        return Math.round(Latinha() / lata);
    }

    public double preco(){
        if (nivel == 1)
        {
            return tipo1 * Latao();
        } else if (nivel == 2) {
            return tipo2 * Latao();
        }
        else
            return tipo3 * Latao();
    }

    public double getAb() {
        return ab;
    }

    public void setAb(double ab) {
        this.ab = ab;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getVolumePiramide() {
        return volumePiramide;
    }

    public void setVolumePiramide() {
        this.volumePiramide = areaBase * h;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase() {
        this.areaBase = (ab * h) / 2;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    public void setAreaTriangulo() {
        this.areaTriangulo = Math.round((h * h) + (ab * ab));
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal() {
        this.areaTotal = areaBase + areaTriangulo;
    }

    public double getNivel() {
        return nivel;
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Piramide{");
        sb.append("tipo1=").append(tipo1);
        sb.append(", tipo2=").append(tipo2);
        sb.append(", tipo3=").append(tipo3);
        sb.append(", rendimento=").append(rendimento);
        sb.append(", lata=").append(lata);
        sb.append(", ab=").append(ab);
        sb.append(", h=").append(h);
        sb.append(", nivel=").append(nivel);
        sb.append(", volumePiramide=").append(volumePiramide);
        sb.append(", areaBase=").append(areaBase);
        sb.append(", areaTriangulo=").append(areaTriangulo);
        sb.append(", areaTotal=").append(areaTotal);
        sb.append('}');
        return sb.toString();
    }
}
