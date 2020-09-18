package ted;

import java.util.Scanner;

import exercicios.Retangulo;

public class Teste {
	
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	Retangulo area = new Retangulo();
	
	System.out.println("Informe a base: ");
	double base = teclado.nextDouble();
	
	System.out.println("Informe a altura: ");
	double altura = teclado.nextDouble();
	
	System.out.println("A sua área é de: " + base*altura);
	
	
	}
}
