public class Carrinho {
    private Desconto desconto;

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public double calcularValor(double valor) {
        return desconto.calcular(valor);
    }
} // Contexto
