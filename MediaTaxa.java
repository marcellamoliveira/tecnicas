// Estratégia: Imposto Médio
public class MediaTaxa implements Strategy {
    @Override
    public double calculadora(double valor) {
        return valor * 0.10;
    }
}
