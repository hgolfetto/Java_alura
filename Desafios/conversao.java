public class conversao {
    public static void main(String[] args) {
        double valorEmDolares = 45.00;
        double dolar = 4.94;

        double conversao = (int) (valorEmDolares / dolar);
        System.out.println("O valor em reais é de: R$" + conversao);
    }
}
