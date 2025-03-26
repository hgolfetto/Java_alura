import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double mediaAvalicao = 0, nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota de avaliação: ");
            nota = read.nextDouble();
            mediaAvalicao += nota;
        }

        System.out.println("Média de avaliações: " + mediaAvalicao/3);

    }
}
