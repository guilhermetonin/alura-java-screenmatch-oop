package desafios.extras.gson.modelo;

public class Usuario {
    private int id;
    private String name;
    private String username;
    private boolean active;

    public Usuario(int id, String name, String username) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.active = false;
    }

    public Usuario(Pessoa pessoa) {
        this.id = Integer.valueOf(pessoa.id());
        this.name = pessoa.name();
        this.username = pessoa.username();
        this.active = false;
    }

    @Override
    public String toString() {
        String status = (active) ? "☑" : "⚠";

        return String.format("Usuario (id= %d) {name= '%s', username= '%s', status= %s}",
                this.id, this.name, this.username, status);
    }
}