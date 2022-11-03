package Exec2;

public class Lagarto extends Reptil{

    private String raca;

    public Lagarto(){
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
        final StringBuilder sb = new StringBuilder("Lagarto{");
        sb.append("raca ='").append(raca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
