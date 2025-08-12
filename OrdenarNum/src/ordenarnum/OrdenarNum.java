package ordenarnum;

import java.util.Scanner;

public class OrdenarNum {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		int num1 = en.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num2 = en.nextInt();
		
		System.out.println("Digite o terceiro número:");
		int num3 = en.nextInt();
		
		if (num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num1 < num3) {
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num2 < num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		System.out.println(num1 + "," + num2 + "," + num3);
		
		en.close();
	}
}
