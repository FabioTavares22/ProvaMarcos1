package prova;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		//Para calcular seria 1*4 e 2*3
		
		Scanner sc = new Scanner(System.in);
		
		int [][] A = {{1,2}, {3,4}};
		
		System.out.println("Informe a determinante da matriz: ");
		int det = sc.nextInt();
		
		if(det == 2) {
			for(int i = 0; i < A.length; i++) {
				for(int j = 0; j < A[i].length; j++) {}
			}
			int calcMat = (A[0][0] * A[1][1] - A[1][0] * A[0][1]);
			System.out.println(calcMat);
		}else {
			System.out.println("Essa determiante não é de ordem 2, impossível calcular!");
		}

	}

}
