package util;

import java.util.List;

import entidades.*;
import java.util.Scanner;

public final class UtilFormas {
	
	public static void imprimir(List<Forma> formas)
	{
		//percorrer a lista
		System.out.println("Areas de Formas Geométricas");
		for (Forma forma : formas) {
			
			if(forma instanceof Circulo )
				System.out.println("Area do Círculo = " + forma.getArea());
			else if(forma instanceof Quadrado)
				System.out.println("Area do Quadrado = " + forma.getArea());
			
		}
	}

	public static void imprimir(Circulo circulo) {
		System.out.println("Círculo");
		System.out.println("Area = " + circulo.getArea());
	}
	public static void ler(Circulo circulo) {
		System.out.println("Ler círculo");
		Scanner in = new Scanner( System.in );
        System.out.println(in.nextLine());
	}

	public static void ler(Quadrado quadrado) {
		System.out.println(" Ler quadrado");
		Scanner in = new Scanner( System.in );
        System.out.println(in.nextLine());
	}

	
}


