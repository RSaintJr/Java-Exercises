package Exec2;

public class Main {

    public static void main(String[] args){

        Item f = new Item();
        f.setCodigo(168795);
        f.setDescricao("Pollux");
        System.out.println(f);

        Livro fp = new Livro();
        fp.setAutor("Castor");
        System.out.println(fp);

        Midia fpp = new Midia();
        fpp.setDuracao(15.789f);
        fpp.setGravadora("Olympus");
        System.out.println(fpp);

        VHS pf = new VHS();
        pf.setTitulo("Argo");
        System.out.println(pf);

        CD pfp = new CD();
        pfp.setArtista("Zeus");
        pfp.setAlbum("Argonauts");
        pfp.setFaixas(18);
        System.out.println(pfp);

    }
}
