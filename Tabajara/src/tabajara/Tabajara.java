package tabajara;

import java.util.Scanner;

public class Tabajara {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Qual é o seu salário?");
		double salario = en.nextDouble();
		
		double percentual;
		
		if(salario <= 280) {
			 percentual = 20.00;
		}else if(salario >= 280 && salario < 700) {
			 percentual = 15.00;
		}else if(salario <= 700 && salario < 1500) {
			 percentual = 10.00;
		}else {
			 percentual = 5.00;
		}
		
		double aumento = salario * (percentual / 100);
		double reajuste = salario + aumento;
		
		System.out.println("Salário antes do reajuste: $" + salario);
		System.out.println("Percentual de aumento: " + percentual);
		System.out.println("Aumento de: $" + aumento);
		System.out.println("Novo salário: $" + reajuste);

		
		en.close();
	}

}
