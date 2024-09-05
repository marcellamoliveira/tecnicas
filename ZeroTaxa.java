// Estratégia: Isenção de Imposto
public class ZeroTaxa implements Strategy {
    @Override
    public double calculadora(double valor) {
        return 0;
    }
}