package desafios.extras.listas.compararOrdenar.modelo;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo() {}
    public Titulo(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
