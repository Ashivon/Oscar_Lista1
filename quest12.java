import java.util.Scanner;
public class quest12 {
	/*Verifique se A é maior que 10 imprima: "A > 10" ou verifique se A mais
B é igual a 20, imprima: "A + B == 20'', caso as afirmações não sejam
verdadeiras, imprima: "números não válidos". Sejam as afirmações
anteriores falsas ou verdadeiras imprima: “Sejam bem-vindos à
disciplina de Técnicas de Programação”.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner valor = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite o valor de A:");
		A = valor.nextInt();
		System.out.println("Digite o valor de B:");
		B = valor.nextInt();
		
		if(A > 10 || (A+B) == 20) {
			System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação.");
			if(A > 10)
				System.out.println("A > 10!");
			if((A+B) == 20)
				System.out.println("A + B == 20!");
		} else 
			System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação.\n Números não válidos.");
	}

}
