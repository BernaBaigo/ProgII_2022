package Series;

import java.util.ArrayList;

public class Temporada {

    private int seasonNumber;
    private int numberOfEpisodes;//MAXIMO
    private int canntidadEpisodios;
    private Episodio[] episodes;
    private ArrayList<Episodio> episodios;

    //así estaría creando el arreglo con la cantidad de episodios que tiene la temporada. Ahora el problema es que así
    //todos tendrían mismo titulo y descripción. O no?
    //No sería mejor crear el arreglo dentro de la clase capitulo y de ahí traerlo y usarlo acá?

    public Temporada (int numberOfEpisodes){
        episodes = new Episodio[numberOfEpisodes];
        episodios = new ArrayList<>();
   //     for (int i = 0; i < episodes.length; i++) {

   //         episodes[i] = new Episodio("titulo 1", "descript 1");

    //    }
    }

//    public Temporada (int seasonNumber){
//        this.seasonNumber = seasonNumber;
//        episodes = new Episodio[numberOfEpisodes];
//    }

    public void addChapter (Episodio newEpisode){
        episodios.add(newEpisode);
        for (int i = 0; i < episodes.length; i++) {

            if (episodes[i] == null){
                episodes[i] = newEpisode;
                i = episodes.length;
            }

        }

        System.out.println(episodes.length);

    }

    public Episodio getEpisodio(int ep){
        if (ep<episodios.size()){
            return.episodios.get(ep);
        } else {
            return null;
        }
    }


    public int cantidadEpisodiosVistos(){
        int suma = 0;
        for(int i =0;i<episodios.size();i++){
            Episodio epi = episodios.get(i);
            if (epi.isEpisodeWatched()){
                suma++;
            }
        }
        return suma;
    }
    public int getNumberOfEpisodes(){

        return episodios.size();
        //return numberOfEpisodes = episodes.length;
        this.numberOfEpisodes = 0;


        for (int i = 0; i < episodes.length; i++) {

            if (episodes[i] != null ){
                numberOfEpisodes = i++;
            }

        }

        return numberOfEpisodes;

    }




}
