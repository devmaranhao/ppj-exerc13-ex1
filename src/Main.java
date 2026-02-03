public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Desconto desconto = new DescontoProgressivo(); // Usuário escolhe o desconto. Ex.: Desconto progressivo
        carrinho.setDesconto(desconto);
        System.out.println(carrinho.calcularValor(100));
    }
} // Uso