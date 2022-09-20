public class Main {

    public static void main(String[] args){
        Episode ep1 = new Episode("ep1", "testEp1");
        Episode ep2 = new Episode("ep2", "testEp2");
        Episode ep3 = new Episode("ep3", "testEp3");
        Episode ep4 = new Episode("ep4", "testEp4");
        Episode ep5 = new Episode("ep5", "testEp5");

        Season s1 = new Season();
        s1.addEp(ep1);
        s1.addEp(ep2);

        Season s2 = new Season();
        s2.addEp(ep1);
        s2.addEp(ep2);
        s2.addEp(ep3);

        Season s3 = new Season();
        s3.addEp(ep1);
        s3.addEp(ep2);

        Serie serie1 = new Serie("Serie1", "Descripcion Serie1", "Baigorama", "Fantasy");
        serie1.addSeason(s1);
        serie1.addSeason(s2);
        serie1.addSeason(s3);

        ep1.setWatched();
        ep2.setWatched();

        ep1.setScore(1);
        ep2.setScore(2);

        System.out.println(s1.totalWatchedEps());
        System.out.println(serie1.totalWatchedEpsInSerie());
        System.out.println(s1.averageEpScore());
        System.out.println(serie1.averageSerieScore());

    }

}
