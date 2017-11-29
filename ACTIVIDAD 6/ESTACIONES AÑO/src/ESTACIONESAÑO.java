import java.util.Scanner;

public class ESTACIONESAÑO {

	public static void main(String[] args) {
		
		//Variable//
		int num;
		
		//String para switch//
		String estacion;
		
		//Introduce datos desde teclado e imprime mensaje inicial//
		Scanner t=new Scanner (System.in);
		System.out.println("Introduzca dígito del mes del año que desee.");
		
		//Introduce dígito desde teclado//
		num=t.nextInt();
		
		//Condición//
		switch (num){
			case 1:
				estacion= " Invierno. ";
				break;
				
			case 2:
				estacion= " Invierno. ";
				break;	
				
			case 3:
				estacion= " Primavera. ";
				break;	
			
			case 4:
				estacion= " Primavera. ";
				break;	
				
			case 5:
				estacion= " Primavera. ";
				break;	
				
			case 6:
				estacion= " Verano. ";
				break;	
			
			case 7:
				estacion= " Verano. ";
				break;
				
			case 8:
				estacion= " Verano. ";
				break;		
				
			case 9:
				estacion= " Otoño. ";
				break;		
			
			case 10:
				estacion= " Otoño. ";
				break;	
				
			case 11:
				estacion= " Invierno. ";
				break;	
				
			case 12:
				estacion= " Invierno. ";
				break;	
				
			default:
				estacion= "o no te he pedido. Introduzca valor entre 1 y 12. ";		
		}
		//Imprime resultado//
		System.out.println("Es"+estacion);
	}

}
