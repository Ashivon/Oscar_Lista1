import java.util.Scanner;
public class Quest10 {
	/*Verifique se A é maior que 10 se não for imprima: "número menor que
10". Verifique se A mais B é igual a 20 se não for verdade imprima
"número diferente de 20".*/
	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		int A, B; //declarando veriáveis
		
		System.out.println("Digite o valor de A:");
		A = valor.nextInt(); //recebendo valor de A
		System.out.println("Digite o valor de B:");
		B = valor.nextInt(); //recebendo valor de B
		
		if(A > 10) { //verificando se A>10
		}else //se falsa, executar
			System.out.println("Número menor que 10.");
		if((A+B) == 20) { //verificando se A+B==20
		}else //se falsa, executar
			System.out.println("Número diferente de 20.");		
	}

}
