/*
* Estratégia 3 - Desconto de aniversário
* */
public class DescontoAniversario implements Desconto {

    @Override
    public double calcular(double valor) {
        return valor * 0.85;
    }

} // Classe concreta que implementa a interface Desconto
