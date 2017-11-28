import java.util.Scanner;

public class MULTIPLO {

	public static void main(String[] args) {
	
	//Variable//	
	int num;

	//Scanner de teclado e imprimir texto//
	Scanner t=new Scanner (System.in);
	System.out.println("Inserte número");
	
	//Insertar número por teclado//
	num=t.nextInt();

	//Número insertado, condición e impresión de resultado//
	if (num%3==0 && num%5==0){
			System.out.println("SÍ es múltiplo de 3 y 5");
	}else{
		System.out.println("NO es múltiplo de 3 y 5");
		
	}}
}
