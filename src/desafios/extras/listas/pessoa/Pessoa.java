package desafios.extras.listas.pessoa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade > 0 && idade < 100) {
            this.idade = idade;
        } else System.out.println("Idade inválida.");
    }

    @Override
    public String toString() {
        return String.format("%s (%d anos)", this.getNome(), this.getIdade());
    }
}
