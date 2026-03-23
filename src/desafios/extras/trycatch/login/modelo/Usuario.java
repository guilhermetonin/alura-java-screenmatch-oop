package desafios.extras.trycatch.login.modelo;

import desafios.extras.trycatch.login.excecao.SenhaInvalidaException;

public class Usuario {
    private String nome;
    private String username;
    private String email;
    private String senha;

    public Usuario(String nome, String username, String email, String senha) {
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.setSenha(senha);
    }

    public void setSenha(String senha) {
        if (senha.length() >= 8) {
            this.senha = senha;
        } else {
            throw new SenhaInvalidaException("Senha inválida, tem menos que 8 caracteres.");
        }
    }

    @Override
    public String toString() {
        return "Usuario {" +
                "nome= '" + nome + '\'' +
                ", username= '" + username + '\'' +
                ", email= '" + email + '\'' +
                ", senha= '" + senha + '\'' +
                '}';
    }
}
