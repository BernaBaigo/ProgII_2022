package JuegoDados;

public class Juego2Main {
    public static void main(String[] args){

        Jugador j1 = new Jugador("Bernie");
        Jugador j2 = new Jugador("Martu");
        Dado d1 = new Dado(6);
        Dado d2 = new Dado(15);

        Juego2 jj1 = new Juego2(j1, j2, 7, d1, d2, 50);

        Juego2 jj2 =
                new Juego2(new Jugador("Adri"),
                new Jugador("Lucy"),
                7,
                new Dado(6),
                new Dado(10),50);

        Jugador ganador = jj1.jugar();
        if (ganador != null) {
            System.out.println("Ganó: " + ganador.getNombre() + " con " + ganador.getPuntos() + " puntos");
        } else {
            System.out.println("Empate");
        }

    }

}
