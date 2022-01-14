package ejerciciosDeLaClase1;
import java.util.Scanner;

public class tareaDos {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in); 
		double var1, var2, resultado;
		int choise; 
		System.out.println("------ Bienvenido a la Calculadora ------");
		System.out.print("Introduce el Primer numero: ");
		var1 = sc.nextDouble();
		System.out.print("Introduce el Segundo numero: ");
		var2 = sc.nextDouble();
		    		
	    do{	   
	    	
	    	System.out.println("**Ahora que quieres hacer**");
		    System.out.println("1. sumar");
		    System.out.println("2. restar");
		    System.out.println("3. multiplicar");
		    System.out.println("4. dividir");
		    System.out.println("5. salir");
		    System.out.print("Ingresa tu Opcion: ");
		    choise = sc.nextInt();
			
			switch (choise) {
				case 1: {
					resultado = var1 + var2; 
					System.out.println(" el resultado de la suma es: " + resultado);
					break;
				}
				case 2: {
					resultado = var1 - var2; 
					System.out.println(" el resultado de la resta es: " + resultado);
					break;
				}
				case 3: {
					resultado = var1 * var2; 
					System.out.println(" el resultado de la multiplicación es: " + resultado);
					break;
				}
				case 4: {
					resultado = var1 / var2; 
					System.out.println(" el resultado de la división es: " + resultado);
					break;
				}
				case 5: {
					System.out.println("Gracias por su tiempo");
					break;
				}
				default:
					System.out.println("Opcion INCORRECTA!!!");
					break;
				}
				
		} while (choise != 5);
			
	}
}