package targetSistemas;

import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args) {
		
		int termo1 = 0, termo2 = 1, auxiliar=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("informe um numero para calcular a sequencia de fibonacci : ");
		int termoN = scan.nextInt();
		int [] vetorAuxiliar = new int [termoN+5];
		boolean pertence = false;
		if(termoN == 0 ) {
			System.out.println(termo1);
			vetorAuxiliar[0] = auxiliar;
			pertence = true;
		}
		else if(termoN == 1 ) {
			System.out.println(termo1);
			auxiliar = 1;
			vetorAuxiliar[0] = auxiliar;
			pertence = true;
		}
		else if(termoN == 2 ) {
			
			auxiliar = 1;
			vetorAuxiliar[0] = auxiliar;
			pertence = true;
		}
		else if(termoN == 3 ) {
			
			
			pertence = true;
		}
		
		
		for(int i=2; i <=termoN; i++  ) {
			
			if (i==3) {
				System.out.println(0);
				i++;
			}
			if(i==3) {
				System.out.println(1);
				i++;
			}
			auxiliar = termo1 + termo2;
			termo1 = termo2 ;
			termo2 = auxiliar;
			vetorAuxiliar[i] = auxiliar;
			if(termoN == vetorAuxiliar[i])
			{
				pertence = true;
			}
			
			System.out.println(auxiliar);
			
		}
		if(pertence) {
			System.out.println();
			System.out.println(termoN+" pertence a sequencia de fibonacci");
		}
		else {
			System.out.println(termoN+" não pertence a sequencia de fibonacci");
		}
		
		
	}

}
