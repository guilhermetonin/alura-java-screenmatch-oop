package desafios.extras.encapsulamentos;

public class Livro {
    private String titulo;
    private String autor;

    // getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.printf("""
                Título:\t %s
                Autor:\t %s
                """, titulo, autor);
    }
}
