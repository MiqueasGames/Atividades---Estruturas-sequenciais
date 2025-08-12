package AnoBisexto;

import java.util.Scanner;

public class AnoBisexto {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = en.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("O ano é bisexto");
		}else {
			System.out.println("O ano não é bisexto");
		}
		
		en.close();
		
	}

}
