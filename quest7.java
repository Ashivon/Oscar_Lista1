import java.util.Scanner;
public class quest7 {
	/*Verifique se A é maior que 10 ou se o A mais B é igual a 20, caso sejam
verdadeiras as afirmações imprima: "números válidos”. Caso a primeira
afirmação não seja verdadeira, imprima: "número não válido".*/
	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		int A, B; //declarando variáveis
		
		System.out.println("Digite o valor de A:"); 
		A = valor.nextInt(); //recebendo valor de A
		System.out.println("Digite o valor de B:");
		B = valor.nextInt(); //recebendo valor de B
		
		if(A > 10 || (A+B) == 20) //verificando se A>10 ou A+B==20
			System.out.println("Números válidos.");
		else //se nenhuma verdadeira executar
			System.out.println("Número não válido.");
	}
}
