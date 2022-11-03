package Exec1;

public class Carro extends Veiculo{

    private int portas;

    public Carro (){
        super();
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("portas =").append(portas);
        sb.append('}');
        return sb.toString();
    }
}
