package Exerc.Musica;

public class Principal {
    public static void main(String[] args) {
        Musica music = new Musica();

        music.nomeDaMusica = "Black out Days";
        music.artista = "Phatogram";
        music.anoDeLancamento = 2019;
        music.avalia(10);
        music.avalia(10);
        music.avalia(10);

        music.exibeFichaTecnica();
        System.out.println(music.somaDasAvaliacoes);
        System.out.println(music.numAvaliacoes);
        System.out.println(music.pegarMedia());
    }
}
