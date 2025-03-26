import java.util.Scanner;

public class comparacao {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int n1 = read.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int n2 = read.nextInt();

        if(n1 == n2){
            System.out.println("Os números são iguais.");
        } else if (n1 != n2 && n1 > n2){
            System.out.println("os números são diferentes e " + n1 + " é maior que " + n2);
        } else {
            System.out.println("os números são diferentes e " + n2 + " é maior que " + n1);
        }
    }
}
