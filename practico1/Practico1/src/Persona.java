import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	//Atributos y valores por defecto
	private String nombre = "N";
	private String apellido = "N";
	private LocalDate fnac = LocalDate.of(2000, 1, 1);
	private int dni;
	private String sexo = "femenino";
	private double peso = 1;
	private double altura = 1;
	
	//CONSTRUCTORES:
	
	//Con DNI
	
	public Persona (int dni) {
		this.dni = dni;
	}
	
	//Con DNI - Nombre
	
	public Persona (int dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	
	public Persona (int dni, String nombre, String apellido, LocalDate fnac) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fnac = fnac;
	}
	
	//RESPONSABILIDADES
	
	//Obtener IMC
	public double getIMC (double peso, double altura) {
		return peso / altura * altura; 
	}
	
	//Saber si esta en forma
	public boolean getFit (double peso, double altura) {
		double imc = getIMC(peso, altura);
		if (imc >= 18.5 && imc <= 25) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//saber si está cumpliendo años - la fecha de hoy = a fnac
	public boolean getHappyBirthday (LocalDate fnac) {
		LocalDate hoy = LocalDate.now();
		
		if (hoy == fnac) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//saber si es mayor de edad - calcular años que tiene y comparar
	
	public boolean getEdad (LocalDate fnac) {
		LocalDate hoy = LocalDate.now();
		Period years = Period.between(fnac, hoy);
		System.out.println(years);
		
		if (years.getYears() >= 18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Saber si puede votar
	
	public boolean getEdadVotar (LocalDate fnac) {
		
		LocalDate hoy = LocalDate.now();
		Period years = Period.between(fnac, hoy);
		System.out.println(years);
		
		if (years.getYears() >= 16) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	//Saber si es coherente --> habria que pedirle la edad aparte para comparar
	
	//Pedir toda la info del objeto
	
	//private String nombre = "N";
	//private String apellido = "N";
	//private LocalDate fnac = LocalDate.of(2000, 1, 1);
	//private int dni;
	//private String sexo = "femenino";
	//private double peso = 1;
	//private double altura = 1;
	
	public String getInfo (String nombre, String apellido, LocalDate fnac, int dni, String sexo, double peso, double altura ) {
		String info;
		
		info = (
				"Nombre: " + nombre +
				" Apellido: " + apellido +  
				"dni: " + dni + // creo que para que me ande tengo que parsear de int a string
				
				
				
				);
	}

}

