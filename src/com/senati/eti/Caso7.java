package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		int sueldo = 0;
		float impuesto = 0;
		
		System.out.print("Ingrese sueldo....: " );
		sueldo = sc.nextInt();
		
		if (sueldo > 0 && sueldo <= 1500)
			impuesto = sueldo * 0.03f;
		else if (sueldo > 1500 && sueldo <= 3000)
			impuesto = sueldo * 0.08f;
		else if (sueldo > 3000)
			impuesto = sueldo * 0.12f;
		
		System.out.println("========= Resultados =========");
		System.out.println("Impuesto calculado....: " + df.format(impuesto));
		
	}

}
