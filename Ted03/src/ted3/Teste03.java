package ted3;
import ted003.Retangulo;
public class Teste03 {

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
