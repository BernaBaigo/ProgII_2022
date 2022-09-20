package JuegoDados;

public class Dado {

    private int cantCaras;
    private int ultimoValor;

    public Dado(int cantidad){
        cantCaras = cantidad;
    }

    public int tirar(){
        ultimoValor = (int)((Math.random()*cantCaras)+1);
        return ultimoValor;
    }

    public int getCantCaras() {
        return cantCaras;
    }


    public int getUltimoValor() {
        return ultimoValor;
    }

    public static void main(String[] args){

        Dado d1 = new Dado(6);

        for (int i = 0; i < 100; i++) {

            System.out.println(d1.tirar());

        }

    }


}


