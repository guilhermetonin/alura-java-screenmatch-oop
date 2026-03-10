package desafios.extras.encapsulamentos;

public class IdadePessoa {
    private String nome;
    private int idade;

    // getters
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Informe a idade correta");
        }
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
