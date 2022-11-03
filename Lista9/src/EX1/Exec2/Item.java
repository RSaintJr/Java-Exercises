package Exec2;

public class Item {

    private int codigo;
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("codigo =").append(codigo);
        sb.append(", descricao ='").append(descricao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
