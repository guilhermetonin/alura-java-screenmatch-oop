package desafios.extras.interfaces.moeda;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double valorDolar) {
        double cotacaoAtual = 5.13;
        return valorDolar * cotacaoAtual;
    }
}
