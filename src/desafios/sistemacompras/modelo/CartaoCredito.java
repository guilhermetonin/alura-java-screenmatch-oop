package desafios.sistemacompras.modelo;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaCompras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        listaCompras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public boolean realizaCompra(Compra compra) {
        if (saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.listaCompras.add(compra);
            return true;
        }
        return false;
    }

}
