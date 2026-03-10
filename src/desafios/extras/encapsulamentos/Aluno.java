package desafios.extras.encapsulamentos;

public class Aluno {
    private String nome;
    private double notas;
    private int qtdeNotas = 0;

    // getters
    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public void adicionaNota(double nota) {
        if (qtdeNotas < 4) {
            this.notas += nota;
            qtdeNotas++;
        } else {
            System.out.println("O máximo de notas permitidas são 4 notas por aluno.");
        }

    }

    public double calculaMedia() {
        return notas / qtdeNotas;
    }

}
