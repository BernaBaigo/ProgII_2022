package ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class main {
	public static void main(String[] args) {
		
		LocalDate fecha1 = LocalDate.of(2000, 1, 01);
		LocalDate fecha2 = LocalDate.of(2010, 6, 1);
		
		Period period = Period.between(fecha1, fecha2);
	    
	    System.out.println(period);
	    
	  }


}
