package Exec1;

public class Caminhao extends Veiculo{

    private int eixos;

    public Caminhao(){
        super();
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Caminhao{");
        sb.append("eixos =").append(eixos);
        sb.append('}');
        return sb.toString();
    }
}
