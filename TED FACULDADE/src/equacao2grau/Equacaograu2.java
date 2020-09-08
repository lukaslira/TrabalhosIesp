package equacao2grau;

public class Equacaograu2 {
	
	public static void main(String[] args) {
		
		double a = 1;
		double b = -1;
		double c = -12;
		double delta,baskara1,baskara2;
		
		//Calculo do delta
		delta = Math.pow(b, 2) -4*(a) * (c);
		
		//Formula de Baskara
		baskara1 = (-(b)+ Math.sqrt(delta))/2;
		System.out.println("RESULTADO 1: " + baskara1);
		
		baskara2 = (-(b)- Math.sqrt(delta))/2;
		System.out.println("RESULTADO 2: " + baskara2);
		
	}

}
