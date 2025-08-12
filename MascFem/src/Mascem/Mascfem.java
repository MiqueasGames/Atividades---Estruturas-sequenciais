package Mascem;

import java.util.Scanner;

public class Mascfem {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Seu sexo é masculino ou feminino M/F? ");
		char sexo = en.nextLine().charAt(0);
		
		if (sexo == 'M') {
			System.out.println("M - Masculino");
		} else if (sexo == 'F') {
			System.out.println("F - Feminino");
		}
	
		en.close();
	}

}
