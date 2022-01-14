package ejerciciosDeLaClase1;
import java.util.Scanner;
public class hipotenusa {

	public static void main(String[] args) {
		
		double altura, base, hipotenusa; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introducir el valor de la Altura: ");
			altura = sc.nextDouble();
		System.out.print("Introducir el valor de la Base: ");
			base = sc.nextDouble();
		
		altura = Math.pow (altura,2); // el metodo math.pow ejecuta potencias
		base = Math.pow (base,2);
		hipotenusa = Math.sqrt (altura + base); // el metodo math.sqrt ejecuta raiz cuadradas
			
		System.out.println("--------------------------");
		System.out.println("Valor de Hipotenusa: "+ hipotenusa);
		}
	}


