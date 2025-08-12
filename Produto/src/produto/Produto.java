package produto;

import java.util.Scanner;

public class Produto {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Qual é o valor do produto?");
		float preco = en.nextFloat();
		System.out.println("Qual é o código de origem?");
		int codigo = en.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("O valor do produto: $" + preco);
			System.out.println("Código de origem: 1 - Sul");
			break;
		case 2:
			System.out.println("O valor do produto: $" + preco);
			System.out.println("Código de origem: 2 - Norte");
			break;
		case 3:
			System.out.println("O valor do produto: $" + preco);
			System.out.println("Código de origem: 3 - Leste");
			break;
		case 4:
			System.out.println("O valor do produto: $" + preco);
			System.out.println("Código de origem: 4 - Oeste");
			break;
		case 5:
		case 6:
			System.out.println("O valor do produto: $" + preco);
			System.out.println("Código de origem: 5/6 - Nordeste");
			break;
		case 7:
		case 8:
			System.out.println("O valor do produto: $" + preco);
			System.out.println("Código de origem: 7/8 - Centro-Oeste");
			break;
		default:
			System.out.println("O valor do produto: $" + preco);
			System.out.println("Código de origem: Importado");
			break;
			
		}
		
		en.close();	
		
	}

}
