package Exec1;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(){
        super();
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Moto{");
        sb.append("cilindradas =").append(cilindradas);
        sb.append('}');
        return sb.toString();
    }
}
