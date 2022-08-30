import java.util.Scanner;
public class Quest11 {
	/*Verifique se A é maior que 10 se não for verifique se A mais B é igual a
20, imprima: "A + B == 20''. Caso A não seja maior que 10 e A mais B
for diferente de 20, imprima: "número não válido".*/
	public static void main(String[] args) {

		Scanner valor = new Scanner(System.in);
		int A, B; //declarando variáveis
		
		System.out.println("Digite o valor de A:");
		A = valor.nextInt(); //recebendo valor de A
		System.out.println("Digite o valor de B:");
		B = valor.nextInt(); //recebendo valor de B
		
		if(A > 10) { //verificando se A>10
		}else if((A+B) == 20) //se falsa, verificar se A+B==20
			System.out.println("A + B == 20!");
		else //se falsa, executar
			System.out.println("Número não válido.");
	}

}
