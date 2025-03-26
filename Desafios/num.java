import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = read.nextDouble();

        if(num > 0){
            System.out.println("número positivo.");
        } else {
            System.out.println("Número negativo.");
        }
    }
}
