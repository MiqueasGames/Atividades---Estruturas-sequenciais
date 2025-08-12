package LetraVogal;

import java.util.Scanner; 

public class LetraVogal {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
		char letra = en.nextLine().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra é uma vogal");
		}else {
			System.out.print("A letra é uma consoante");
		}
		
		en.close();
		
	}
}
