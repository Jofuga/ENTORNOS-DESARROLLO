import java.util.Scanner;

public class ESTACIONESA�O {

	public static void main(String[] args) {
		
		//Variable//
		int num;
		
		//String para switch//
		String estacion;
		
		//Introduce datos desde teclado e imprime mensaje inicial//
		Scanner t=new Scanner (System.in);
		System.out.println("Introduzca d�gito del mes del a�o que desee.");
		
		//Introduce d�gito desde teclado//
		num=t.nextInt();
		
		//Condici�n//
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
				estacion= " Oto�o. ";
				break;		
			
			case 10:
				estacion= " Oto�o. ";
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
