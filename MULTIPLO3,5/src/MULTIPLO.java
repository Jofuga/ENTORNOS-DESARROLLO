import java.util.Scanner;

public class MULTIPLO {

	public static void main(String[] args) {
	
	//Variable//	
	int num;

	//Scanner de teclado e imprimir texto//
	Scanner t=new Scanner (System.in);
	System.out.println("Inserte n�mero");
	
	//Insertar n�mero por teclado//
	num=t.nextInt();

	//N�mero insertado, condici�n e impresi�n de resultado//
	if (num%3==0 && num%5==0){
			System.out.println("S� es m�ltiplo de 3 y 5");
	}else{
		System.out.println("NO es m�ltiplo de 3 y 5");
		
	}}
}
