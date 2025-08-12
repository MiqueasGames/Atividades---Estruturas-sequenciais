package PosNegZero;

import java.util.Scanner;

public class PosNegZero {
	public static void main(String[]args) {
	Scanner en = new Scanner(System.in);
	
	System.out.println("Digite um número:");
	int num = en.nextInt();
	
	if (num > 0) {
		System.out.println(num + " é um número positivo");
	}else if (num < 0) {
		System.out.println(num + " é um número negativo");
	}else {
		System.out.println("é zero");
	}
	
	en.close();
	
	}
}
