import java.util.Scanner;

public class Universidad1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 ;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca su puntuación para ver a que Facultad podrá acceder.");
		n1=teclado.nextInt();
		
		
// if y else (Puntuaciones y Facultades).
		
		if(n1 >= 100) {
		    System.out.println("Enhorabuena! Usted accederá a la Facultad de Sistemas.");
		} else if(n1 < 100 && n1 >= 90){
		    System.out.println("Enhorabuena! Usted accederá a la Facultad de Electrónica.");
		} else if(n1 < 90 && n1 >= 80) {
		    System.out.println("Enhorabuena! Usted accederá a la Facultad de Industrial.");
		} else if(n1 >=70 && n1 < 80) {
		    System.out.println("Enhorabuena! Usted accederá a la Facultad de Administración.");
		} else if(n1 <=70) {
		    System.out.println("Lo sentimos. No podrá acceder a ninguna de estas facultades.");		
	}}
}
