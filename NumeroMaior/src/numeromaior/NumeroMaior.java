package numeromaior;

import java.util.Scanner;

public class NumeroMaior {
	public static void main(String[]args){
		Scanner eg = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = eg.nextInt();
		eg.nextLine();
		
		System.out.println("Digite o segundo número: ");
		int num2 = eg.nextInt();
		eg.nextLine();
		
		if (num1 > num2) {
			System.out.println("o maior número é " + num1);
		} else if (num1 < num2){
			System.out.println("o maior número é: " + num2);
		} else {
			System.out.println("os numeros são iguais");
		}
		
		eg.close();
		
		
	}

}
