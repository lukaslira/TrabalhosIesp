package ted;

import java.util.Scanner;

import exercicios.Retangulo;

public class Teste {

	public static void main(String[] args) {

	
	Retangulo area = new Retangulo();
	double total;
	double moldura;
	
	total = area.getcomprimento()*area.getaltura();
	System.out.println("�rea total: " + total + " Cm�");
	
	moldura = total - area.getareaInter();
	System.out.println("�rea da moldura: " + moldura + " Cm�");
	
	

	

	}
}