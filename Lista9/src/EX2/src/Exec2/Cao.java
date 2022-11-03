package Exec2;

public class Cao extends Mamifero{

    private String raca;

    public Cao(){
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
        final StringBuilder sb = new StringBuilder("Cão{");
        sb.append("raca ='").append(raca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
