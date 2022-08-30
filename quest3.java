import java.util.Scanner;
public class quest3 {
	/*Verifique se A é igual a 10, se verdade imprima: "A == 10", e verifique
se o A mais B é igual a 20, se verdade imprima: "A + B == 20". verifique
se o B é igual a 10, se verdade imprima: "B == 10", (obs: todas as três
impressões são permitidas na saída do programa).*/
	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		int A, B; //declarar variáveis
		
		System.out.println("Digite o valor de A:");
		A = valor.nextInt(); //recebendo valor de A
		System.out.println("Digite o valor de B:");
		B = valor.nextInt(); //recebendo valor de B
		
		if(A == 10 || (A+B) == 20 || B ==10) { //verificando se alguma das afirmações propostas são verdadeiras
			if(A == 10) //verificando A == 10
				System.out.println("A == 10!");
			if((A+B) == 20) //verificando A + B == 10
				System.out.println("A + B == 20!");
			if(B == 10) //verificando B == 10
				System.out.println("B == 10!");
		}	
	}

}
