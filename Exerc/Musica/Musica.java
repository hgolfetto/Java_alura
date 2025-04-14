package Exerc.Musica;

public class Musica {
    String nomeDaMusica;
    String artista;
    int anoDeLancamento;
    int somaDasAvaliacoes;
    int numAvaliacoes;


    void exibeFichaTecnica(){
        System.out.println("Nome da música: " + nomeDaMusica);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegarMedia(){
        return somaDasAvaliacoes / numAvaliacoes;
    }

}
