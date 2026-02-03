/*
* Estratégia 1 - Percentual fixo
* */
public class DescontoPercentual implements Desconto {
    private double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double calcular(double valor) {
        return valor * (1 - percentual); // 1 representa 100% do valor
    }

} // Classe concreta que implementa a interface Desconto
