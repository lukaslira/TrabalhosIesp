//ALUNO: LUCAS ALVES DA CRUZ LIRA
//TURMA: SISTEMAS DE INFORMAÇÃO - P4

package salarioTrabalhador;
import java.util.Scanner;
public class SalarioTrab {
	
	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		double horasTrab, horas,bruto,imposto,inss,sindicato,liquido,total;
		
		
		System.out.println("VALOR POR HORA TRABALHADA: ");
		horasTrab = in.nextDouble();
		
		System.out.println("HORAS TRABALHADAS: ");
		horas = in.nextDouble();
		
		//RESULTADOS
		bruto = horasTrab * horas;
		System.out.println("\nSALÁRIO BRUTO: R$" + bruto);
		
		imposto = (0.11 * bruto);
		System.out.println("IMPOSTO DE RENDA: R$" + imposto);
		
		inss = (0.08 * bruto);
		System.out.println("INSS: R$" + inss);
		
		sindicato = (0.05 * bruto);
		System.out.println("SINDICATO: R$" + sindicato);
		
		liquido = (bruto-(imposto+sindicato+inss));
		System.out.println("SALÁRIO LÍQUIDO: R$" + liquido);
		
		total = (imposto+inss+sindicato);
		System.out.println("\nVALOR TOTAL DESCONTADO: R$" + total);
		
		
	}

}
