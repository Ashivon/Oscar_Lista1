import java.util.Scanner;
public class quest9 {
	/*Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
verdadeiras imprima: "número não válido".*/
	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		int A, B; //declarando variáveis
		
		System.out.println("Digite o valor de A:");
		A = valor.nextInt(); //recebendo valor de A
		System.out.println("Digite o valor de B:");
		B = valor.nextInt(); //recebendo valor de B
		
		if(A > 10 && (A+B) == 20) //verificando se A>10 e se A+B==20
			System.out.println("A + B == 20!");
		else //se alguma afirmalção falsa, executar
			System.out.println("Número não válido.");
	}

}
