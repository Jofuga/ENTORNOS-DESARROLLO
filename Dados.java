import java.util.Random;
import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		//Declaración de variables: dados y contador.//
		int dado1,dado2,dado3;
		int cont = 0 ;
		// Scanner del teclado e imprima el inicio del juego con la frase.//
		Scanner teclado=new Scanner (System.in);
		System.out.println("Tire los dados");
		//Clase Random para dar aleatoreidad a los números.//
		Random alea=new Random();
		
		//Dado1 aleatorio hasta numero máximo seis y el +1 para que no cuente cero e imprima resultado//		
		dado1=alea.nextInt(6)+ 1 ;{
			System.out.println(dado1);
		}
		//Si dado1 es igual a seis el contador sumará uno.//
		if (dado1==6){
			cont= cont +1 ;
		
		}

		dado2=alea.nextInt(6)+ 1 ;{
			System.out.println(dado2);
		}
		
		if (dado2==6){
			cont= cont +1 ;
		}
		
		dado3=alea.nextInt(6)+ 1 ;{
			System.out.println(dado3);
		}
		
		if (dado3==6){
			cont= cont +1 ; 
		}
		//Si el contador resulta tres se imprime Oro y sucesivamente.//
		if (cont==3){
			System.out.println("Su premio es Oro");
		} else if (cont==2){
			System.out.println("Su premio es Plata");
		} else if (cont==1){
			System.out.println("Su premio es Bronce");
		} else {
			System.out.println("Has perdido");
		
		
		}
	}
}
