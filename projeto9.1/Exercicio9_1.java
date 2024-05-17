import java.util.*;
public class Exercicio9_1 {

	public static void main(String[] args) {
		String dataNasc;
		String dataHoje;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a data de nascimento: ");
		dataNasc = leia.next();
		
		System.out.print("Digite a data de hoje: ");
		dataHoje = leia.next();
		
		System.out.println("Idade: " + calcularIdade(dataNasc, dataHoje) );

	}

	public static int calcularIdade( String dtNasc, String dtHoje) {
		int idade;
		int anoNasc;
		int anoHoje;
		int mesNasc;
		int mesHoje;
		int diaNasc;
		int diaHoje;
		
		anoNasc = Integer.parseInt(dtNasc.substring(6));
		anoHoje = Integer.parseInt(dtHoje.substring(6));	
		
		idade = anoHoje - anoNasc;
		
		mesHoje = Integer.parseInt( dtHoje.substring(3,5));
		mesNasc = Integer.parseInt(dtNasc.substring(3,5));
		
		diaHoje = Integer.parseInt( dtHoje.substring(0,2));
		diaNasc = Integer.parseInt(dtNasc.substring(0,2));
		
		if (mesNasc > mesHoje) {
			idade --;
		} else if (mesNasc == mesHoje && diaNasc > diaHoje) {
			idade --;
		}
		return idade;
	}
}
