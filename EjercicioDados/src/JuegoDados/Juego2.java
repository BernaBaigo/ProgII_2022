package JuegoDados;

public class Juego2 {

    private Jugador jugador1;
    private Jugador jugador2;
    private int minPuntos;
    private int cantCaras;
    private int cantRondas;
    private Dado d1;
    private Dado d2;


    //ATENCIÓN - Como mis atributos son objetos que no han sido creados, su valor es nulo, ya que no apuntan a
    //ningún lado. Por eso en el constructor del juego tengo que crear también a los jugadores

    public Juego2(Jugador j1, Jugador j2, int minPuntos, Dado d1, Dado d2, int cantRondas){

        jugador1 = j1;
        jugador2 = j2;
        this.cantRondas = cantRondas;
        this.minPuntos = minPuntos;
        this.d1 = d1; //Yo como juego no me interesa cuantas caras tiene el dado
        this.d2 = d2;

    }
    //Le puedo pedir los jugadores al juego

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    //Le puedo pedir los puntos también

    public int getPuntosJugador1(){
        return jugador1.getPuntos();
    }

    public int getPuntosJugador2(){
        return jugador2.getPuntos();
    }

    //Le puedo prguntar también quién ganó

    public Jugador ganador(){
        if (jugador1.getPuntos() > jugador2.getPuntos()){
            return jugador1;
        }
        else if (jugador2.getPuntos() > jugador1.getPuntos()) {
            return jugador2;
        }
        else {
            return null;
        }
    }

    public Jugador jugar(){

        int puntos1;
        int puntos2;

        for (int i = 0; i < cantRondas; i++) {

            puntos1 = jugador1.tirarDados(d1,d2);
            puntos2 = jugador2.tirarDados(d1, d2);

            if ((puntos1 > minPuntos) && (puntos1 > puntos2)){
                jugador1.sumarPuntos();
            }

            else {
                if ((puntos2 > minPuntos) && (puntos2 > puntos1)){
                    jugador2.sumarPuntos();
                }
            }
        }

        return this.ganador();

    }

}
