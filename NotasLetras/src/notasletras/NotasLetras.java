package notasletras;

import java.util.Scanner;

public class NotasLetras {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		float nota1 = en.nextFloat();
		
		System.out.println("Digite a segunda nota");
		float nota2 = en.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		if(media >= 0 && media < 4) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Média: " + media);
			System.out.println("E - Reprovado");
		}else if(media >= 4 && media < 6) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Média: " + media);
			System.out.println("D - Reprovado");
		}else if(media >= 6 && media < 7.5) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Média: " + media);
			System.out.println("C - Aprovado");
		}else if(media >= 7.5 && media < 9) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Média: " + media);
			System.out.println("B - Aprovado");
		}else if(media >= 9 && media <= 10) {
			System.out.println("Primeira nota: " + nota1);
			System.out.println("Segunda nota: " + nota2);
			System.out.println("Média: " + media);
			System.out.println("A - Aprovado");
		}
	}

}
