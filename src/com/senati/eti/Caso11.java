package com.senati.eti;
import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero [1-7]....: ");
		int n = sc.nextInt();
		
		String nombre_dia = "";
		
		switch (n) {
			case 1:
			nombre_dia = "Lunes";
			break;
		    case 2:
		    	nombre_dia = "Martes";
		    	break;
		    case 3:
				nombre_dia = "Mi�rcoles";
				break;
		    case 4:
				nombre_dia = "Jueves";
				break;
		    case 5:
				nombre_dia = "Viernes";
				break;
		    case 6:
				nombre_dia = "Sabado";
				break;
		    case 7:
				nombre_dia = "Domingo";
				break;
		    default:
		    	nombre_dia = "Desconocido";   
		}
		
		System.out.println("\n======== Resultados ========");
		System.out.println("D�a de la semana........: " + nombre_dia);
		

	}

}
