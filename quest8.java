import java.util.Scanner;
public class quest8 {
	/*Verifique se A é maior que 10, se verdade imprima: "A > 10" e verifique
se A mais B é igual a 20, se verdadeiro, imprima: "A + B == 20” se não
for verdade: imprima "número não válido ".*/
	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		int A, B; //declarando variáveis
		
		System.out.println("Digite o valor de A:");
		A = valor.nextInt(); //recebendo valor de A
		System.out.println("Digite o valor de B:");
		B = valor.nextInt(); //recebendo valor de B
		
		if(A > 10) { //verificando se A>10
			System.out.println("A > 10!"); 
			if ((A+B) == 20) // verificando se A+B==20
				System.out.println("A + B == 20!");
			else //se não for verdadeira executar
				System.out.println("Número não válido.");
		}
	}
}
