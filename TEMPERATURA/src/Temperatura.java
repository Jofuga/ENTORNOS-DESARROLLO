import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		int tem;
		
		Scanner t=new Scanner(System.in);
		System.out.println("Introduzca temperatura.");
	
		tem= t.nextInt();
		
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
