import java.util.Scanner;

public class whiile {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double mediaAvalicao = 0, nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite a nota de avaliação ou -1 para encerrar: ");
            nota = read.nextDouble();

            if(nota != -1){
                mediaAvalicao += nota;
                totalDeNotas++;
            }
            
        }

        System.out.println("Média de avaliações: " + mediaAvalicao / totalDeNotas);
    }
}
