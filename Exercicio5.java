package Lacos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite um n�mero: ");
		x = leia.nextInt();
		
		do 
		{
			y += x;
			System.out.println("\nDigite um novo n�mero: ");
			x = leia.nextInt();
		}
		while(x!=0);
		System.out.println("\nA soma dos valores �: "+y);
	}
		
}
