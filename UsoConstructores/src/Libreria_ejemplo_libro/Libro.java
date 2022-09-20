package Libreria_ejemplo_libro;
// creo la clase
public class Libro {
    private String nombre;
    private String autor;
    double precio;

    //creo constructores que van a instanciar con diferenes parámetros
    public Libro(String n, String a, double p) {
        nombre = n;
        autor = a;
        precio = p;
        System.out.println("Libro(String n, String a, double p)");
    }

    //constructor sin parámatros
    public Libro(){
        //aca tengo dos opciones:
        // no settear ningun valor
        // settear valores por defecto

//        nombre = ""; //valores quedan vacios en este caso
//        autor = "";
//        precio = 0.0;
        this("", 0.0);
        System.out.println("Libro()");
    }

    //podemos tener constructores que permitan settear algunos atributos inicialmente

    public Libro (String n, double p){
        this(n,"",p);
        System.out.println("Libro (String n, double p)");
//        nombre = n;
//        autor = "";
//        precio = p

    }

    //Este método entra en conflicto con el anterior porque tiene MISMA SIGNATURA, pero si cambio el orden voy a poder usarlo
    /*public Libro (String a, double p){
        nombre = "";
        autor = a;
        double = p;
    }*/

    public Libro (double p, String a) {
        this("", a, p);
        System.out.println("Libro (double p, String a)");
//        nombre = "";
//        autor = a;
//        precio = p;
    }
}



