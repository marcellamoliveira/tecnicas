// Estratégia: Imposto mais alto
public class GrandeTaxa implements Strategy {
    @Override
    public double calculadora(double valor) {
        return valor * 0.30;
    }
}