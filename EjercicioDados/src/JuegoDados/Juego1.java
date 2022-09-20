/*
package JuegoDados;//NOTAS GENERALES

// - Evitar poner valores constantes adentro de mi código. POr eso declaramos var min puntos y cant ronda
// - Hasta el programa funciona, pero no está orientado a objetos, ya que están todos juntos una sola clase

public class Juego1 {

    private int puntosJugador1;
    private int puntosJugador2;
    private int minPuntos;
    private int cantCaras;
    private int cantRondas;


    //Esto lo hacemos por convención para ordenar el código. De esta manera si otra persona viene,
    // mira el constructor y ya sabe cómo se setea los valores iniciales.

    //CONSTRUCTOR 1
    public Juego1(){
        //this.puntosJugador1 = 0;
        //this.puntosJugador2 = 0;
        //minPuntos = 7;
        this(7);
    }

    // CONSTRUCTOR 2
    public Juego1(int minPuntos){
        //this.puntosJugador1 = 0;
        //this.puntosJugador2 = 0;

        //this.minPuntos = minPuntos;
        this(minPuntos, 6);
        // -->con esto es como que sale hacia afuera y busca el métono que tiene dos parámetros (metedo3)
    }

    // CONSTRUCTOR 3
    public Juego1(int minPuntos, int cantCaras){
        this(minPuntos, cantCaras, 10);
    }

    // CONSTRUCTOR 4
    public Juego1(int minPuntos, int cantCaras, int cantRondas){
        this.puntosJugador1 = 0;
        this.puntosJugador2 = 0;
        this.minPuntos = minPuntos;
        this.cantRondas = cantCaras;
        this.cantRondas = cantRondas;
    }
    //METEDOS GET
    public int getPuntosJugador1() {
        return puntosJugador1;
    }
    public int getPuntosJugador2() {
        return puntosJugador2;
    }
    //METEDO PARA TIRAR DADOS
*/
/*    private int tirarDado(){
        //random devuelve entre 0 y 1
        // [1;6)

        return (int)((Math.random()*cantCaras)+1);
    }*//*


    //METODO PARA SABER QUIEN GANO
    public String ganador(){
        if (puntosJugador1 > puntosJugador2){
            return "Ganó jugador 1";
        } else if (puntosJugador2 > puntosJugador1) {
            return "Ganó jugador 2";

        }
        else {
            return "Empate";
        }
    }

    //METODO PARA QUE JUEGUEN
    public String jugar(){

        int puntos1;
        int puntos2;

        for (int i = 0; i < cantRondas; i++) {

            puntos1 = this.tirarDado() + this.tirarDado();
            puntos2 = this.tirarDado() + this.tirarDado();

            if ((puntos1 > minPuntos) && (puntos1 > puntos2)){
                puntosJugador1++;
            }

            else {
              ///  if ((puntos2 > minPuntos) && (puntos2 > puntos1)){
                    puntosJugador2++;
                }
            }
        }

        return this.ganador();

    }

}

*/
