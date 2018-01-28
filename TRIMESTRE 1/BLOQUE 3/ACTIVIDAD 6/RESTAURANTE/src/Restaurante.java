import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {
		
	//Variables//
	double importe;
	double impuesto;
	double descuento1;
	double descuento2;
	double importetotal;
	
	//introducir datos por teclado e imprimir inicio programa//
	Scanner t=new Scanner(System.in);
	System.out.println("¿Cuanto es la cuenta?");
	
	//Nombrar variable, importe accede desde teclado e impuesto es..// 
	importe=t.nextInt();
	impuesto=importe*0.019;
	
	//Condición//
	if (importe<=100){
		descuento1 = 0.1*importe;
		importe = importe-descuento1;
		importetotal = importe + impuesto;
	}else{		
		descuento2 = 0.2*importe;
		importe = importe - descuento2;
		importetotal =  importe + impuesto;}
		
	//Imprimir resultado//	
	System.out.println("Su cuenta tiene un importe total de " + importetotal + " incluyendo descuento del 10% e impuesto incluidos.");
	
	}
}
