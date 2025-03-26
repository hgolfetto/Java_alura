import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = read.nextLine();

        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = read.nextInt();
        System.out.println("Seu filme favorito é " + filme + " e o ano de lançamento é " + anoDeLancamento);
    }
}
