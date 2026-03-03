package desafios.tres.animal;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Auuu au au");
    }

    public void abanarRabo() {
        System.out.println("abanando o rabo...");
    }
}
