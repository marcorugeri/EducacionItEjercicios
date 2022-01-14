package ejerciciosDeLaClase1;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {

		int base, altura, superficie; 
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduca la base del triangulo: ");
		base = sc.nextInt();
		System.out.print("Introduca la altura del triangulo: ");
		altura = sc.nextInt();
		
		superficie = (base * altura) / 2;
		
		System.out.println("La superficie del triangulo es: " + superficie);

	}

}
