package Exec2;

public class Midia  extends Item{

    private String gravadora;
    private float duracao;

    public Midia (){
        super();
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Midia{");
        sb.append("gravadora='").append(gravadora).append('\'');
        sb.append(", duracao=").append(duracao);
        sb.append('}');
        return sb.toString();
    }
}
