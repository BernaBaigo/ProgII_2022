package JuegoDados;

public class Jugador {

    private int puntos;
    private String nombre;

    //CONSTRUCTOR
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    //SETTER & GETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumarPuntos() {
        this.puntos++;
    }

    //QUÉ HACE UN JUGADOR? Tira el dado para jugar
    //DELEGANDO en el objeto Dado la función de tirarse que tiene el dado
    public int tirarDados(Dado d1, Dado d2){
        return d1.tirar() + d2.tirar();
    }

    //Juego 3 --> ahora en vez de darle los dados le doy el cubilete (que ya viene con X cant de dados)
    public int tirarDados(Cubilete cubilete1){
        return cubilete1.tirar();
    }
}
