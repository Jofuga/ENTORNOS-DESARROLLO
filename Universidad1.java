import java.util.Scanner;

public class Universidad1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 ;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca su puntuaci�n para ver a que Facultad podr� acceder.");
		n1=teclado.nextInt();
		
		
// if y else (Puntuaciones y Facultades).
		
		if(n1 >= 100) {
		    System.out.println("Enhorabuena! Usted acceder� a la Facultad de Sistemas.");
		} else if(n1 < 100 && n1 >= 90){
		    System.out.println("Enhorabuena! Usted acceder� a la Facultad de Electr�nica.");
		} else if(n1 < 90 && n1 >= 80) {
		    System.out.println("Enhorabuena! Usted acceder� a la Facultad de Industrial.");
		} else if(n1 >=70 && n1 < 80) {
		    System.out.println("Enhorabuena! Usted acceder� a la Facultad de Administraci�n.");
		} else if(n1 <=70) {
		    System.out.println("Lo sentimos. No podr� acceder a ninguna de estas facultades.");		
	}}
}
