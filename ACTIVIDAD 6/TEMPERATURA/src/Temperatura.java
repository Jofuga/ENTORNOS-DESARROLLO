import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		//Variable//
		int tem;
		
		//Introduce datos por teclado e imprime mensaje inicial//
		Scanner t=new Scanner(System.in);
		System.out.println("Introduzca temperatura.");
		
		//Introduce tem por teclado//
		tem= t.nextInt();
		
		//Condici�n//
		if (tem<10){
			System.out.println("El cl�ma es fr�o.");}
		if (tem>=10 && tem<=20){
			System.out.println("El cl�ma es Templado.");}
		if (tem>=21 && tem<=30){
			System.out.println("El cl�ma es Calor.");}
		else if (tem>30){
			System.out.println("El cl�ma es Tropical.");}	
		
		
	}

}
