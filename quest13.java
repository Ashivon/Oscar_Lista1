import java.util.Scanner;

public class quest13 {
	/*Verifique se A é maior que 10, se verdade imprima: "A > 10". Ainda,
verifique se o A mais B é igual a 20, se verdade imprima: "A + B == 20”.
Caso as afirmações não sejam verdadeiras, imprima: "números não
válidos".*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner valor = new Scanner(System.in);
		int A, B;
		
		System.out.println("Digite o valor de A:");
		A = valor.nextInt();
		System.out.println("Digite o valor de B:");
		B = valor.nextInt();
		
		if(A > 10 && (A+B) == 20) 
			System.out.println("A > 10!\nA + B == 20!");
		else
			System.out.println("Números não válidos.");
	}

}
