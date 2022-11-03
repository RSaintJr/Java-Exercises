package Exec2;

public class Livro extends Item {

    private String autor;

    public Livro (){
        super();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Livro{");
        sb.append("autor ='").append(autor).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
