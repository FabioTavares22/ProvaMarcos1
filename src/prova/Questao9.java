package prova;

import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a palavra desejada: ");
		String palavra1 = scan.nextLine();
		System.out.println("Digite a palavra de comparação: ");
		String palavra2 = scan.nextLine();
		
		System.out.println(palavra1.equals(palavra2));

	}

}
