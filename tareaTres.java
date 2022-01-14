package ejerciciosDeLaClase1;

import java.util.Scanner;

public class tareaTres {

	public static void main(String[] args) {
	
		int numeroUsuario, tokenRandom = (int)(Math.random()*9+1);; 
		Scanner sc = new Scanner (System.in);
		System.out.println("--JUGUEMOS A LAS ADIVINANZAS--");
		
		do {
				
			System.out.println("--POR FAVOR INGRESE UN NUMERO DEL 1 AL 10--");
			numeroUsuario = sc.nextInt();
			
			if (tokenRandom == numeroUsuario) {
				System.out.println("Felicidades, ADIVINASTE, el numero era: "+tokenRandom);
			}else {
				System.out.println("Fallaste vuelve a intentarlo");
			}
			}
			while (tokenRandom != numeroUsuario);
				
		System.out.println("FIN DEL PROGRAMA");
	}

}
