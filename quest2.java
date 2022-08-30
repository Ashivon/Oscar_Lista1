import java.util.Scanner;
public class quest2 {
	/*Verifique se A é menor que 10, se verdade imprima: "A < 10", e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso
nenhumas das afirmação não seja verdadeira, imprima: "número não
válido", (obs: apenas uma impressão é permitida na saída do programa).*/
	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		int A, B; //declaração de variáveis
		
		System.out.println("Digite o valor de A:");
		A = valor.nextInt(); //recebendo valor de A
		System.out.println("Digite o valor de B:");
		B = valor.nextInt(); //recebendo valor de B
		
		if (A < 10 || (A+B) == 20){ //verificando se alguma das airmações é verdadeira
			if (A < 10) { //se A menor que 10 imprimir a seguinte mensagem
				System.out.println("A < 10!");
			}
			if ((A+B) == 20) { //se  A + B igual a 20, imprimir a seguinte mensagem
				System.out.println("A + B == 20!");
			}
		} else //caso nenhuma das afirmações seja verdadeira, imprimir
			System.out.println("Número não válido!");
	}

}
