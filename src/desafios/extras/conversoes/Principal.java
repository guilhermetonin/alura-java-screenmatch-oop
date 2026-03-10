package desafios.extras.conversoes;

public class Principal {

    static void main(String[] args) {

        // instância cachorro
        Cachorro max = new Cachorro();
        System.out.println("Som cachorro: ");
        max.fazerSom();

        // testa instância animal generica
        Animal animalGenerico = new Animal();
        System.out.println("\nSom Animal Generico: ");
        animalGenerico.fazerSom();

        // casting de cachorro para animal
        if (max instanceof Cachorro) {
            Animal meuAnimal = (Animal) max;

            System.out.println("\nSom Max Casting: ");
            meuAnimal.fazerSom();
            // meuAnimal.abanarRabo() não compila
        } else {
            System.out.println("Impossível fazer o casting.");
        }
    }
}
