package Lacos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maiorcinquenta=0,menorvinte=0,idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com uma idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			if(idade>50)
			{
				maiorcinquenta++;
			}
			if(idade>0 && idade<21)
			{
				menorvinte++;
			}
			System.out.println("\nEntre com uma idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("\nO total de pessoa com maior de cinquenta anos é de: "+maiorcinquenta);
		System.out.println("\nO total de pessoa menor de vinte e um anos é de: "+menorvinte);
	}
	
	
}
