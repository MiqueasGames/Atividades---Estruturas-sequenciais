package imparPar;

import java.util.Scanner;

public class ImparPar {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = en.nextInt();
		
		if(num % 2 == 0) {
			num += 1;
			System.out.println(+ num);
		}else if( num % 3 == 0) {
			num += 1;
			System.out.println(+ num);
		}
		
		en.close();
		
	}

}
