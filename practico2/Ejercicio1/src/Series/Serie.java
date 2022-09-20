package Series;

import java.util.ArrayList;

//Atributos
public class Serie {

    private String seriesTitle;
    private String seriesReview;
    private String producer;
    private String genre;

    private int numberOfSeasons;

    ArrayList<Temporada>  temporadas;
    //CONSTRUCTOR
    public Serie (String seriesTitle, String seriesReview, String producer, String genre){

        this.seriesTitle = seriesTitle;
        this.seriesReview = seriesReview;
        this.producer = producer;
        this.genre = genre;
        temporadas = new ArrayList<>();

    }

    //SETTER & GETTERS

   public Episodio getEpisodio(int temp, int epi){
        if (temp<temporadas.size()){
            Temporada aux = temporadas.get(temp);
            return aux.getEpisodio(epi);
            //return temporadas.get(temp).getEpisodio(epi);
        } else {
            return null;
        }

   }

   public int cantidadEpisodiosVistos(){

        int suma = 0;
        for(int i = 0; i<temporadas.size(); i++){
            suma = suma + temporadas.get(i).cantidadEpisodiosVistos();
        }
        return suma;

   }

    public String getSeriesTitle() {
        return seriesTitle;
    }

    public String getSeriesReview() {
        return seriesReview;
    }

    public String getProducer() {
        return producer;
    }

    public String getGenre() {
        return genre;
    }
}


