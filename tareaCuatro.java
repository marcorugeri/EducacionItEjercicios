package ejerciciosDeLaClase1;

import java.util.Scanner;

public class tareaCuatro {

	public static void main(String[] args) {
		
		String usuarioGuardado = "admin", passGuardado = "admin123", usuarioFinal, passFinal;
		int i;
		Scanner sc = new Scanner (System.in);
		System.out.println("--Bienvenido al banco--");
		
		for (i = 3; i >= 0; i-- ) {
			 
			 System.out.print("Introduzca su User: ");
			 usuarioFinal = sc.next();
			 System.out.print("Introduzca su Password: ");
			 passFinal = sc.next();
			 boolean usuario = usuarioFinal.equals(usuarioGuardado);
			 boolean password = passGuardado.equals(passFinal);
			 
			 
			 if (usuario && password) {
				 System.out.println("Sus credenciales son correctas, Bienvenid@");
				 break;
			 }else if (i == 0) {
				 System.out.println("Usuario Bloqueado");
					break;				 
			 }else {
				 System.out.println("usuario o contraseña invalida, por favor intenta de nuevo, te quedan "+i+" intentos");
			 }
		
		} 
		
		System.out.println("Fin del Programa");
	
	}

}

