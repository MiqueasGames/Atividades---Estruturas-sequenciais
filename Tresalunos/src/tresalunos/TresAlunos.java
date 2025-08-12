package tresalunos;

import java.util.Scanner;

public class TresAlunos {
	public static void main(String[]args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Qual é a idade do primeiro aluno?");
		int idade1 = en.nextInt();
		
		System.out.println("Qual é a idade do segundo aluno?");
		int idade2 = en.nextInt();
		
		System.out.println("Qual é a idade do terceiro aluno?");
		int idade3 = en.nextInt();
		
		int media = idade1 + idade2 + idade3;
		media = media / 4;
		
		if (media < 25) {
			System.out.println("Turma jovem");
		}else if(media <= 40 && media >= 25) {
			System.out.println("Turma adulta");
		}else if(media > 40) {
			System.out.println("Turma idosa");
		}
		
		en.close();
		
	}

}
