package Exec1;

public class Pessoa {

    private String n;
    private String end;

    public String getN() {
        return n;
    }

    public Pessoa(String n) {
        setN(n);
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getEnd() {
        return end;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Exec1.Pessoa{");
        sb.append("Nome ='").append(n).append('\'');
        sb.append(", Endereço ='").append(end).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setEnd(String end) {
        this.end = end;
    }
}