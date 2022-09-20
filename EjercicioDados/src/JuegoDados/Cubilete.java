package JuegoDados;

public class Cubilete {

    private Dado[] dados; //Creo un arreglo con los dados que va a tener el cubilete

    //CONSTRUCTORES

    //Con cantidad de dados
    public Cubilete (int cantDados){
        dados = new Dado[cantDados]; //Creo el arreglo con "cantDados" cantidad de dados
        for (int i = 0; i < dados.length; i++) {
            dados[i] = new Dado(6);
        }
    }

    //Con cantidad de dados y cantidad de caras de los dados
    public Cubilete (int cantDados, int cantCaras){
        dados = new Dado[cantDados]; //Creo el arreglo con "cantDados" cantidad de dados
        for (int i = 0; i < dados.length; i++) {
            dados[i] = new Dado(cantCaras);
        }
    }

    //cantidad de dados viene por un arreglo de afuera
    // OJO no sabemos cómo fue creado entonces no sabemos si viene con null
    public Cubilete (Dado[] arrDadosDeAfuera){
        dados = arrDadosDeAfuera;
    }

    //Le pido al cubilete que me muestre uno de los dados
    public Dado getDadoPos (int posicion){
        if ( (posicion >= 0) && (posicion < dados.length) ){
            return dados[posicion];
        }
        else {
            return null;
        }
    }

    //Le cambio uno de los dados al cubilete
    public void setNuevoDado(int posicion, Dado nuevoD){
        if ( (posicion>=0)&&(posicion< dados.length)&&(nuevoD!=null)){
            dados[posicion] = nuevoD;
        }
    }


    public int tirar(){
        //DELEGANDO
        int suma = 0;
        for (int i = 0; i < dados.length; i++) {
            suma = suma + dados[i].tirar();
        }
        return suma;
    }
}
