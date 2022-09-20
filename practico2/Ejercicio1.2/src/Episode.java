public class Episode {
    //ATRIBUTOS
    private String title;
    private String description;
    private boolean watched;
    private int epScore;
    private int scoreMax = 5;
    private int getScoreMin = 1;
    //calificación dada valores de 1 a 5
    // Si no se vio un episodio particular, la calificación dada será un valor negativo.

    //CONSTRUCTOR
    public Episode (String title, String description){
        this.title = title;
        this.description = description;
        watched = false;
        epScore = -1;
    }

    //SETTERS & GETTERS
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isWatched() {
        return watched;
    }

    public int getScore() {
        return epScore;
    }

    //Qué sabe hacer un episodio?

    //Fue visto
    public boolean setWatched (){
        return watched = true;
    }

    //Calificar

    public void setScore(int score){
        if (watched == false){
            System.out.println("Episodio no visto, imposible calificar");
        }

        else if ((score <= scoreMax && score >= getScoreMin) && (watched == true)) {

            this.epScore = score;
            System.out.println("Nueva calificación: " + score);

        }
        else {

            System.out.println("Calificación incorrecta. Calificación debe ser de 1 a 5");
        }
    }

}


