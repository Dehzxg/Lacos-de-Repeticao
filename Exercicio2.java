package Lacos;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
	 
		int par=0,imp=0,x,y;
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<10;x++)
		{
			System.out.println("\nDigite um numero");
			y = leia.nextInt();
			
			if(y % 2 ==0) 
			{
				par++;
			}
		else
		{
			imp++;
		}
			
	}
		System.out.printf("\nO total de valores pares : %d",par);
		System.out.printf("\nO total de números impares: %d",imp);
		
	}
}


