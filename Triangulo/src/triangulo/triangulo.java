package triangulo;

import java.util.Scanner;

public class triangulo {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Qual é o tamanho do primeiro lado?");
		float lado1 = en.nextFloat();
		
		System.out.println("Qual é o tamanho do segundo lado?");
		float lado2 = en.nextFloat();
		
		System.out.println("Qual é o tamanho do terceiro lado?");
		float lado3 = en.nextFloat();
		
		if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
			System.out.println("Não é possível ser um triângulo");
		}else if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo Equilátero");
		}else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("Triângulo Escaleno");
		}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Tringulo Isósceles");
		}
		
		en.close();
	}


}
