package ted3;
import ted003.Retangulo;
public class Teste03 {

	public static void main(String[] args) {

		
		Retangulo area = new Retangulo();
		double total;
		double moldura;
		
		total = area.getcomprimento()*area.getaltura();
		System.out.println("Área total: " + total + " Cm²");
		
		moldura = total - area.getareaInter();
		System.out.println("Área da moldura: " + moldura + " Cm²");
		
		

		

		}
}
