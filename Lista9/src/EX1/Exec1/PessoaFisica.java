package Exec1;

public class PessoaFisica extends Pessoa{

    private String cpf;
    private String estadoCivil;

     public PessoaFisica(String n) {
         super(n);
     }

     @Override
     public String toString() {
         final StringBuilder sb = new StringBuilder("Exec1.PessoaFisica{");
         sb.append("Nome = ").append(getN()).append('\'');
         sb.append("CPF ='").append(cpf).append('\'');
         sb.append(", Estado Civil ='").append(estadoCivil).append('\'');
         sb.append('}');
         return sb.toString();
     }

     public String getCpf() {
         return cpf;
     }

     public void setCpf(String cpf) {
         this.cpf = cpf;
     }

     public String getEstadoCivil() {
         return estadoCivil;
     }

     public void setEstadoCivil(String estadoCivil) {
         this.estadoCivil = estadoCivil;
     }

 }