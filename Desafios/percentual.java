public class percentual {
    public static void main(String[] args) {
        
        double precoOriginal = 100;
        double percentualDesconto = 10;

        double desconto = (percentualDesconto / 100) *precoOriginal;
        double precoFinal = precoOriginal - desconto;

        System.out.println("O preço final é de: R$" + precoFinal);

    }
}
