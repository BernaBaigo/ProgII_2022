
public class Avion {
	
	//mis atributos -- por convension van siempre arriba o primero y despues los metodos
	private String color;
	private int cantidadAsientos;
	private int cantidadTripulacion;
	private int codigoID;
	private double balance;
	
	
	//constructor - metodo que no tiene retorno y se llama igual que la clase
	
	public Avion() {
		codigoID = 15;
		color = "blanco";
		cantidadAsientos = 3;
		cantidadTripulacion = 1;
		balance = cantidadAsientos / cantidadTripulacion;
	}
	
	//un objeto puede tener tantos constructores como sea necesario
	
	public Avion(int codigoId) {
		this.codigoID = codigoID;
		color = "blanco";
		cantidadAsientos = 3;
		cantidadTripulacion = 1;
		balance = cantidadAsientos / cantidadTripulacion;
	}
	
	//SIGNATURA --> al momento de crear un método hay que tener cuidado con el uso de la signatura
	//La signatura es parte del nombre del método, y es lo que dice qué tipo de variables vienen por parámetro en ese método
	//Dicho de otra forma, el nombre del método en este caso es --> avion (int,int,int,string)

	public Avion(int codigoID, int cantidadAsientos, int cantidadTripulacion, String color) {
		codigoID = codigoID;
		cantidadAsientos = cantidadAsientos;
		cantidadTripulacion = cantidadTripulacion;
		color = "blanco";
		this.setColor(color); // -->acá lo que hago es llamar al método set color para controlar la forma en la que se cambia el color, si no cualquier parámetro que me pasen cambiaría el color
	}
	
	
	
	public String getColor() {
		return color;
		
	}
	
	public void setColor (String unColor) {
		if (!unColor.equals("celeste")) //ESTO NO SE HACE - Más adelante lo hacemos de una mejor forma
		
		color = unColor;
	}
	
	public int getCodigoID () {
		return codigoID;
	}
	

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	public int getCantidadTripulacion() {
		return cantidadTripulacion;
	}

	public void setCantidadTripulacion(int cantidadTripulacion) {
		this.cantidadTripulacion = cantidadTripulacion;
	}

}
