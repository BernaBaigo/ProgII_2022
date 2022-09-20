public class Electrodomestico {

    //Atributos y valores por defecto
    // son nombre, precio base, color, consumo energético y peso
    // El color por defecto es gris plata.
    // El consumo energético 10 Kw.
    // Precio base 100 pesos.
    // El peso es 2 kg.

    private String nombre;
    private double pbase = 100;
    private String color = "Gris plata";
    private int kw = 10;
    private double peso = 2;

    private double balance = pbase / peso;


    //Constructores

    public Electrodomestico (String nombre){
        this.nombre = nombre;
    }

    public Electrodomestico (String nombre, double pbase){
        this.nombre = nombre;
        this.pbase = pbase;
    }

    public Electrodomestico (String nombre, double pbase, String color){
        this.nombre = nombre;
        this.pbase = pbase;
        this.color = color;
    }

    public Electrodomestico(String nombre, double pbase, String color, int kw){
        this.nombre = nombre;
        this.pbase = pbase;
        this.color = color;
        this.kw = kw;
    }

    public Electrodomestico (String nombre, double pbase, String color, int kw, double peso){
        this.nombre = nombre;
        this.pbase = pbase;
        this.color = color;
        this.kw = kw;
        this.peso = peso;
    }

    //Funcionalidades

    //El electrodomestico es de bajo consumo --> menor que 45 kw
    public boolean getConsumo (int kw){
        if (kw <= 45){
            return true;
        }
        else {
            return false;
        }
    }

    //balance - costo / peso
    public double getBalance(double pbase, double peso){
        return balance = pbase / peso;
    }

    //producto alta gama - balance > 3
    public boolean getGama(double balance){
        if (balance > 3){
            return true;
        }
        else {
            return false;
        }
    }
// setters y getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPbase() {
        return pbase;
    }

    public void setPbase(double pbase) {
        this.pbase = pbase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKw() {
        return kw;
    }

    public void setKw(int kw) {
        this.kw = kw;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

