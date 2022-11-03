package Exec1;

public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String tipoEmpresa;

    public PessoaJuridica (String n){
        super(n);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PessoaJuridica{");
        sb.append("Nome = ").append(getN()).append('\'');
        sb.append("CNPJ ='").append(cnpj).append('\'');
        sb.append(", Tipo da Empresa= '").append(tipoEmpresa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
