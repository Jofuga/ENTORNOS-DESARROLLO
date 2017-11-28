import java.util.Random;
import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {
		
		int dado1,dado2,dado3;
		int cont = 0 ;
		
		Scanner teclado=new Scanner (System.in);
		System.out.println("Tire los dados");
		
		Random alea=new Random();
		
				
		dado1=alea.nextInt(6)+ 1 ;{
			System.out.println(dado1);
		}

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
