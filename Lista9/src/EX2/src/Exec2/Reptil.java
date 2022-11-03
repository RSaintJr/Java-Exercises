package Exec2;

public class Reptil extends Animal{

    private String familia;

    public Reptil(){
        super();
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reptil{");
        sb.append("especie = '").append(familia).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
