import java.util.Scanner;
public class Quest1 {
	/*Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso a
segunda afirmação não seja verdadeira, imprima: "número não válido".*/

	public static void main(String[] args) {

		int A, B;		//declaração de variáveis
		Scanner valordeA = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		A = valordeA.nextInt(); //lendo valor de A
		System.out.println("Digite o valor de B:");
		B = valordeA.nextInt(); //lendo valor de B
		
		if(A > 10) { //verificando se A > 10
			System.out.println("A > 10!");
			if ((A+B)==20) { //verificando se A + B == 20
				System.out.println("A + B == 20!");
			} else 
				System.out.println("Número não válido.");
		}
	}

}
