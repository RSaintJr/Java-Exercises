package Exec1;

public class Main {
    public static void main(String[] args){

        Pessoa p = new Pessoa("Passáro");
        p.setEnd("Debaixo da ponte");
        System.out.println(p);

        PessoaFisica pf = new PessoaFisica("Bird");
        pf.setCpf("987.645.089-96");
        pf.setEstadoCivil("Viúvo");
        System.out.println(pf);

        PessoaJuridica pfv = new PessoaJuridica("Vogel");
        pfv.setCnpj("98.167-328");
        pfv.setTipoEmpresa("Concessionária");
        System.out.println(pfv);
    }
}
