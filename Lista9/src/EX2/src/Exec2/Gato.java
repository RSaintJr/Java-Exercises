package Exec2;

public class Gato extends Mamifero{

    private String raca;

    public Gato(){
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
        final StringBuilder sb = new StringBuilder("Gato{");
        sb.append("raca ='").append(raca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
