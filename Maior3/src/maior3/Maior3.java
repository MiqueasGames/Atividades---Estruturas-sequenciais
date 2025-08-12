package maior3;

import java.util.Scanner;

public class Maior3 {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = en.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = en.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int num3 = en.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("o maior número é: " + num1 );
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("o maior número é: " + num2 );
		}else {
			System.out.println("o maior número é: " + num3 );
		}
		
		en.close();
		
	}

}
