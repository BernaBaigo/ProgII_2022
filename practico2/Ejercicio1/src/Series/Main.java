package Series;

public class Main {

    public static void main(String[] args){

        Episodio E1 = new Episodio("Pilot", "Test Episode");

        Temporada T1 = new Temporada(1);
        T1.addChapter(new Episodio("E2", "E2 description"));

        System.out.println(T1.getNumberOfEpisodes());


//        System.out.println(E1.getEpisodeTitle());
//        System.out.println(E1.getEpisodeDescription());
//        System.out.println(E1.isEpisodeWatched());
//        System.out.println(E1.getEpisodeScore());

//        E1.setEpisodeScore(2);
//
//        E1.setEpisodeWatched();
//        E1.setEpisodeScore(6);
//        E1.setEpisodeScore(3);
//
//        E1.getEpisodeInfo();

        //System.out.println("La temporada " + T1 + " tiene " + T1.getNumberOfEpisodes() + " episodios");
        ;
    }
}
