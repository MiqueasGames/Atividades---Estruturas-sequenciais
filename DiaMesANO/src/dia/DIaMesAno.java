package dia;

import java.util.Scanner;

public class DIaMesAno {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		int dia = en.nextInt();
		
		if(dia > 31) {
			System.out.println("Dia inválido! \nComece de novo");
			System.exit(0);
		}
		
		System.out.println("Digite o mes: ");
		int mes = en.nextInt();
		
		if(mes > 12) {
			System.out.println("Mês inválido! \nComece de novo");
			System.exit(0);
		}
		
		System.out.println("Digite o Ano: ");
		int ano = en.nextInt();
		
		if(ano > 9999 && ano < 1000) {
			System.out.println("Ano inválido! \nComece de novo!");
			System.exit(0);
		}
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
	
		en.close();
		
	}
	
}
