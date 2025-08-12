package mediaswitch;

import java.util.Scanner;

public class MediaSwitch {
	public static void main(String[]args){
		Scanner en = new Scanner(System.in);
		
		System.out.println("informe a primeira nota: ");
		float nota1 = en.nextFloat();
		
		
		System.out.println("informe a segunda nota: ");
		float nota2 = en.nextFloat();
		
		
		System.out.println("informe a terceira nota: ");
		float nota3 = en.nextFloat();
				
		System.out.println("informe a quarta nota: ");
		float nota4 = en.nextFloat();
		
		
		float soma = nota1 + nota2 + nota3 + nota4;
		float media = soma / 4;
		
		System.out.println("Sua média é: " + media);
		
			if(media >= 0 && media < 3) {
			System.out.println("Reprovado!");
			}else if(media >= 3 && media <= 6.9) {
			System.out.println("Em exame");
			}else if(media >= 7 && media <= 10){
			System.out.println("Aprovado!");
			}
		
		en.close();
		
	}
	
	
}
