package Exec2;

public class VHS extends Midia{

    private String titulo;

    public VHS(){
        super();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VHS{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
