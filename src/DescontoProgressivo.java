/*
* Estratégia 2 - Desconto progressivo
* */
public class DescontoProgressivo implements Desconto {

    @Override
    public double calcular(double valor) {
        double percentual = valor / 25;
        if (percentual > 0.20) {
            percentual = 0.20;
        }
        return valor * (1 - percentual);
    }

} // Classe concreta que implementa a interface Desconto
