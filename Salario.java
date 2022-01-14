package ejerciciosDeLaClase1;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
	 String nombre; 
	 float hrTrabajadas, precioHr = 20, salarioBruto, salarioNeto, descuento; 
	 Scanner scn = new Scanner (System.in);
	 
	 System.out.println("---------- Bienvenido a su Sistema de Balance Salarial---------");
	 System.out.print("Introduza su nombre: ");
	 nombre = scn.next(); 
	 System.out.print("Introduza Horas Trabajadas: ");
	 hrTrabajadas = scn.nextFloat(); 
	 
	 salarioBruto = hrTrabajadas * precioHr; 
	 descuento = salarioBruto * 0.25f; 
	 salarioNeto = salarioBruto - descuento;
	 
	 System.out.println("Hola " + nombre + " Bienvenido");
	 System.out.println("Tu Sueldo en Bruto es:" +salarioBruto);
	 System.out.println("Tu Sueldo en Neto es:" +salarioNeto);
	 System.out.println("---------- Fin del Programa ---------");
	 
	 	 

	}
}
