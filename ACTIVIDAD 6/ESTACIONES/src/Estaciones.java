import java.util.Scanner;

public class Estaciones {

	public static void main(String[] args) {
		//Variable//
		int num; 
		//String para switch//
		String estacion;
		
		//Introducir datos por teclado e imprimir inicio//
		Scanner t=new Scanner (System.in);
		System.out.println ("Introduzca un número del 1 al 4.");
		
		//Se introducira un número por teclado//
		num= t.nextInt();
		
		//Condición//
		switch (num){
			case 1:
				estacion= " Verano. ";
				break;
				
			case 2:
				estacion= " Otoño. ";
				break;
				
			case 3:
				estacion= " Invierno. ";
				break;
				
			case 4:
				estacion= " Primavera. ";
				break;
				
			default:
				estacion= "o no te he pedido. Introduzca valor entre 1 y 4. ";
		}
		//Imprime resultado//
		System.out.println ("Es"+estacion);
			
		}

	}

