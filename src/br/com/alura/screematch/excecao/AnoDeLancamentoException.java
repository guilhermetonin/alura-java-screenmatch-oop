package br.com.alura.screematch.excecao;

public class AnoDeLancamentoException extends RuntimeException {
    private String mensagem;

    public AnoDeLancamentoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
