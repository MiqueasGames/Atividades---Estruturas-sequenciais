package aprovado;

import java.util.Scanner;

public class Aprovado {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("informe a primeira nota: ");
		int nota1 = en.nextInt();
		en.nextLine();
		
		System.out.println("informe a segunda nota: ");
		int nota2 = en.nextInt();
		en.nextLine();
		
		int soma = nota1 + nota2;
		int media = soma / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		
		en.close();
	}
	

}
