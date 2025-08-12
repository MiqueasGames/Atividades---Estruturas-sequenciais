package turnos;

import java.util.Scanner;

public class Turnos {
	public static void main(String[]args){
		Scanner en = new Scanner(System.in);
		
		System.out.print("Em qual turno você estuda? M-Matutino V-Vespertino N-Noturno");
		char turno = en.nextLine().charAt(0);
		
		if (turno == 'M') {
			System.out.print("Bom dia!");
		}else if (turno == 'V') {
			System.out.print("Boa tarde!"); 		
		}else if(turno == 'N'){
			System.out.print("Boa Noite!");
		}
		
	en.close();
	
}

}