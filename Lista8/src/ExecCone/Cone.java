package ExecCone;

public class Cone {

    private final double tipo1 = 238.90;
    private final double tipo2 = 467.98;
    private final double tipo3 = 758.34;
    private final double rendimento = 3.45;
    private final int lata = 18;
    private double geratriz;
    private double altura;
    private double raio;
    private double nivel;
    private double areaCirculo;
    private double areaLateral;
    private double areaTotal;


    public Cone(double altura, double raio, double nivel) {
        this.setAltura(altura);
        this.setRaio(raio);
        this.setNivel(nivel);
    }

    public double Litrin(){
        return areaTotal * rendimento;
    }

    public double Litrao(){
        return  Math.round((Litrin() / lata));
    }

    public double Preco(){
        if (nivel == 1)
        {
            return Litrao() * tipo1;
        } else if (nivel == 2) {
            return Litrao() * tipo2;
        }
        else{
            return Litrao() * tipo3;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getNivel() {
        return nivel;
    }

    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    public double getGeratriz() {
        return geratriz;
    }

    public void setGeratriz() {
        this.geratriz = Math.sqrt((altura * altura) + (raio * raio));
    }

    public double getAreaCirculo() {
        return areaCirculo;
    }

    public void setAreaCirculo() {
        this.areaCirculo = 3.14 * (raio * raio);
    }

    public double getAreaLateral() {
        return areaLateral;
    }

    public void setAreaLateral() {
        this.areaLateral = 3.14 * (raio * geratriz);
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal() {
        this.areaTotal = 3.14 * (raio * (raio + geratriz));
    }

    @Override
    public String toString() {
        return "Cone{" +
                "tipo1=" + tipo1 +
                ", tipo2=" + tipo2 +
                ", tipo3=" + tipo3 +
                ", rendimento=" + rendimento +
                ", lata=" + lata +
                ", geratriz=" + geratriz +
                ", altura=" + altura +
                ", raio=" + raio +
                ", nivel=" + nivel +
                ", areaCirculo=" + areaCirculo +
                ", areaLateral=" + areaLateral +
                ", areaTotal=" + areaTotal +
                '}';
    }
}
