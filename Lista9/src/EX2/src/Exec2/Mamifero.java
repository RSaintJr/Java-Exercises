package Exec2;

public class Mamifero extends Animal{

    private String classe;

    public Mamifero(){
        super();
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mamifero{");
        sb.append("especie ='").append(classe).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
