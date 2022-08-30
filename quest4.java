import java.util.Scanner;
public class quest4 {
	/*Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
imprima: "número válido". Caso as afirmações não sejam verdadeiras,
Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
diferentes de 10; A é menor que 10) caso não seja verdade imprima:
"número não válido".*/
	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		int A, B; //declarando variáveis
		
		System.out.println("Digite o valor de A:");
		A = valor.nextInt(); //recebendo valor de A
		System.out.println("Digite o valor de B:");
		B = valor.nextInt(); //recebendo valor de B
		
		if(A > 10 || (A+B) == 20) // verificando se alguma das afirmações verdadeiras
			System.out.println("Número válido");
		else if(A == B) // verificando se A == B
			System.out.println(" A é igual B;\n A e B são diferentes de 10;\n A é menor que 10");
		else // se A != B executar:
			System.out.println("Número não válido.");
	}
}
