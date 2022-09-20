import java.util.ArrayList;

public class Serie {

    private String sTitle;
    private String sDescription;
    private String sCreator;
    private String sGenre;
    private ArrayList<Season> seasons;

//CONSTRUCTOR DE SERIE
    public Serie (String sTitle, String sDescription, String sCreator, String sGenre){
        this.sTitle = sTitle;
        this.sDescription = sDescription;
        this.sCreator = sCreator;
        this.sGenre = sGenre;
        seasons = new ArrayList<Season>();
    }

    //AGREGAR TEMPORADAS A UNA SERIE (igual que agregar cap a temp)
    public void addSeason(Season newSeason){
        boolean noExiste = true;
        for (int i = 0; i < seasons.size(); i++) {

            if (seasons.get(i).equals(newSeason)){
                noExiste = false;
            }
        }
        if (noExiste){
            seasons.add(newSeason);
            System.out.println("se agregó la temporada" + newSeason.getSeasonNumber());
        }
        else {
            System.out.println("La temporada ya existe");
        }
    };

    //CANT DE TEMPS EN UNA SERIE
    public int getCantSeasons(){

        return seasons.size();
    }

    //TOTAL EPS VISTOS DE UNA SERIE
    public int totalWatchedEpsInSerie(){
        int totalEpsWatchedInSerie = 0;
        for (int i = 0; i < seasons.size(); i++) {
            totalEpsWatchedInSerie += seasons.get(i).totalWatchedEps();

        }
        return totalEpsWatchedInSerie;
    }

    //CALIFICACION PROMEDIO DE EPS VISTOS en la serie
    public double averageSerieScore(){
        double averageScoreInSerie = 0.0d;
        for (int i = 0; i < seasons.size(); i++) {

            averageScoreInSerie += (double) seasons.get(i).averageEpScore();
        }
        return averageScoreInSerie;
    }

//    public void getEpsInSeason(){
//        int epsAll = 0;
//        for (int i = 0; i < seasons.size(); i++) {
//            seasons.get(i).getCantEp();
//            epsAll++;
//        }
//        System.out.println(epsAll);
//    }



}
