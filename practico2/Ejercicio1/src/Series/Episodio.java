package Series;

//atributos
public class Episodio {
    private String episodeTitle;
    private String episodeDescription;
    private boolean episodeWatched;
    private int episodeScore;
    private int scoreMax = 5;
    private int scoreMin = 1;
    //valores de 1 a 5
    // Si no se vio un episodio particular la calificación dada será un valor negativo.


    //CONSTRUCTORES

    public Episodio(String episodeTitle, String episodeDescription) {
        this.episodeTitle = episodeTitle;
        this.episodeDescription = episodeDescription;
        episodeWatched = false;
        episodeScore = -1;
    }

    //QUÉ SABE HACER UN EPISODIO??? QUÉ LE PUEDO PEDIR AL EPISODIO???

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public String getEpisodeDescription() {
        return episodeDescription;
    }

    public boolean isEpisodeWatched() {
        return episodeWatched;
    }

    public int getEpisodeScore() {
        return episodeScore;
    }

    public void getEpisodeInfo(){
        System.out.println("Episodio: " + episodeTitle);
        System.out.println("Descripción: " + episodeDescription);
        System.out.println("Visto: " + episodeWatched);
        System.out.println("Calificación: " + episodeScore);
    }

    public boolean setEpisodeWatched() {
        return episodeWatched = true;

    }

    public void setEpisodeScore(int episodeScore) {

        if (episodeWatched == false) {

            System.out.println( "Imposible calificar un capítulo que no ha sido visto");

        }

        else if ((episodeScore >= scoreMin) && (episodeScore <= scoreMax) && (episodeWatched = true)){

            this.episodeScore = episodeScore;
            System.out.println("Nueva calificación: " + episodeScore);

        }

        else {
            System.out.println( "Calificación incorrecta. Ingresar un valor entre 1 y 5");
        }

    }


    //sabe ingresar su calificación
// (Si el valor ingresado como calificación no es correcto
// imprimir un mensaje por pantalla y no cambiar el valor anterior)



}







