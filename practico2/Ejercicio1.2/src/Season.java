import java.util.ArrayList;

public class Season {
    //ATRIBUTOS
    private ArrayList<Episode> episodes;
    private int seasonNumber;

    //CONSTRUCTOR DE TEMPORADA
    public Season (){
        episodes = new ArrayList<Episode>();
    }

    //CREAR (agregar) UN CAPITULO NUEVO EN LA TEMPORADA
    public void addEp (Episode newEpisode){
        boolean noExiste = true;
        for (int i = 0; i < episodes.size(); i++) {

            if (episodes.get(i).equals(newEpisode)){
                noExiste = false;
            }
        }
        //Le pregunta a cada uno si el episodio ya está, y sale y dice noExiste=true o noExiste=false
        //Después aplica este IF en función a lo que sale el NoExiste de arriba
        if (noExiste){
            episodes.add(newEpisode);
            System.out.println("se agregó el episodio " + newEpisode.getTitle());
        }
        else {
            System.out.println("El episodio ya existe");
        }
    }

    //PEDIR A LA TEMPORADA QUE ME MUESTRE EL EPISODIO X
    public Episode getEpisode (int epNumber){
        if ( epNumber < episodes.size()){
            return episodes.get(epNumber);
        }
        else {
            return null;
        }
    };

    //TOTAL DE EPISODIOS EN TEMPORADA
    public int getCantEp(){
        return episodes.size();
    };
//IMPRIME TODOS LOS EPISODIOS QUE TIENE UNA TEMP
    public void printEpisodes(){
        for (int i = 0; i < episodes.size(); i++) {
            System.out.println(episodes.get(i).getTitle());
        }
    }

    //TOTAL DE EPISODIOS VISTOS DE UNA TEMPORADA
    public int totalWatchedEps(){
        int totalEpsWatched = 0;
        for (int i = 0; i < episodes.size(); i++) {

            if (episodes.get(i).isWatched() == true) {
                totalEpsWatched++;
            }
        }
        //System.out.println(totalEpsWatched);
        return totalEpsWatched;
    }

    //CALIFICACIÓN PROMEDIO DE EPS VISTOS en la temporada
    public double averageEpScore(){
        int sumScore = 0;
        double scoreAverage = 0.0d;
        for (int i = 0; i < episodes.size(); i++) {
            if (episodes.get(i).isWatched()==true){
                sumScore += (double) episodes.get(i).getScore();//casting de prepo para ver si anda
            }

        }
        scoreAverage = (double) (sumScore/totalWatchedEps());

        return scoreAverage; //No sé por qué no lo toma como double y me pone el promedio en enteros
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }
}
