package peso;

import java.util.Scanner;

public class PesoIdeal {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		float altura = en.nextFloat();
		
		System.out.println("Informe seu peso em kg: ");
		float peso = en.nextFloat();
		
		en.nextLine();
		
		System.out.println("Informe seu sexo masculino/feminino: ");
		String sexo = en.nextLine();
		
		
		if(sexo.equals("masculino")) {
			
			float pesoI = (72.7f * altura) - 58f;
			
			en.nextLine();
			
			System.out.println("altura: " + altura + ", " + "peso: " + peso + ", " + "sexo: " + sexo);
			System.out.println("seu peso ideal: "+ pesoI );
			
				if(peso < pesoI) {
					System.out.print("Você está abaixo do seu peso ideal");
				}else if(peso > pesoI) {
					System.out.print("Você está acima do seu peso ideal");
				}else {
					System.out.print("Você está no seu peso ideal");
				}
				
		}
		
		if(sexo.equals("feminino")) {
			
			float pesoI = (62.1f * altura) - 44.7f;
	
			en.nextLine();
	
			System.out.println("altura: " + altura + ", " + "peso: " + peso + ", " + "sexo: " + sexo);
			System.out.println("seu peso ideal: "+ pesoI );
	
				if(peso < pesoI) {
					System.out.print("Você está abaixo do seu peso ideal");
				}else if(peso > pesoI) {
					System.out.print("Você está acima do seu peso ideal");
				}else {
					System.out.print("Você está no seu peso ideal");
				}
		}
		
		en.close();
	}

}
