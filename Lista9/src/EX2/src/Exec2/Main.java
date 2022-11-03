package Exec2;

public class Main {

    public static void main (String[] args){

        Animal animalia = new Animal();
        animalia.setCarnivoro(false);
        animalia.setHerbivoro(false);
        animalia.setOnivoro(true);
        System.out.println(animalia);

        Mamifero mamalia = new Mamifero();
        mamalia.setClasse("Mamifero");
        Cao dog = new Cao();
        dog.setRaca("Pitbull");
        Gato cat = new Gato();
        cat.setRaca("Persa");
        System.out.println(cat);
        System.out.println(dog);

        System.out.println(mamalia);

        Reptil reptilia = new Reptil();
        reptilia.setFamilia("Cheloniidae");
        Tartaruga taruga = new Tartaruga();
        taruga.setRaca("Caretta caretta");
        Lagarto lagas = new Lagarto();
        lagas.setRaca("Calango-verde");
        System.out.println(lagas);
        System.out.println(taruga);
    }
}
