public class ImpostoTaxa {
    private Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public double executeStrategy(double valor) {
        return strategy.calculadora(valor);
    }
}
