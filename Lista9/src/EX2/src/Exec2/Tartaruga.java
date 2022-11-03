package Exec2;

public class Tartaruga extends Reptil{

    private String raca;

    public Tartaruga(){
        super();
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tartaruga{");
        sb.append("raca ='").append(raca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
